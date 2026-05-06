package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SunLow: ImageVector
    get() {
        if (_sunLow != null) return _sunLow!!
        _sunLow = tablerFilledIcon(
            name = "SunLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.407 16.993l.01 .01c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.104-.093c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012M7.007 16.993l.01 .01c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.104-.093c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012M12 7c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12l.005-.217C7.121 9.109 9.323 7 12 7M7.007 5.593l.01 .01c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13L5.593 7.007C5.214 6.615 5.219 5.991 5.605 5.605c.386-.386 1.009-.391 1.402-.012M18.407 5.593l.01 .01c.372 .373 .39 .972 .042 1.367-.349 .395-.945 .452-1.362 .13l-.104-.093c-.26-.251-.364-.623-.273-.973 .092-.35 .365-.623 .714-.714 .35-.092 .721 .013 .973 .273M4.01 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L4 13c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052ZM12 3c.507 0 .934 .38 .993 .883L13 4.01c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 4c0-.552 .448-1 1-1M20.01 11c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L20 13c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052ZM12 19c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 20c0-.552 .448-1 1-1"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _sunLow!!
    }

private var _sunLow: ImageVector? = null
