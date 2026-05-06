package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LivePhoto: ImageVector
    get() {
        if (_livePhoto != null) return _livePhoto!!
        _livePhoto = tablerFilledIcon(
            name = "LivePhoto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6C8.686 18 6 15.314 6 12l.004-.225C6.125 8.551 8.774 6 12 6M12 10c-1.047-0-1.917 .806-1.995 1.85L10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2M15.9 19.11c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88l-.007-.127c0-.552 .448-1 1-1M19.04 16.61c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88l-.007-.127c0-.552 .448-1 1-1M20.77 13c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L19.77 14c0-.552 .448-1 1-1M20.77 9c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L19.77 10c0-.552 .448-1 1-1M19.04 5.39c.552 0 1 .448 1 1 .003 .552-.443 1.002-.995 1.005-.552 .003-1.002-.443-1.005-.995 0-.562 .448-1.01 1-1.01M15.9 2.89c.552 0 1 .448 1 1 .003 .552-.443 1.002-.995 1.005-.552 .003-1.002-.443-1.005-.995 0-.562 .448-1.01 1-1.01M12 2c.552 0 1 .448 1 1 .003 .552-.443 1.002-.995 1.005C11.453 4.008 11.003 3.562 11 3.01 11 2.448 11.448 2 12 2M8.1 2.89c.552 0 1 .448 1 1 .003 .552-.443 1.002-.995 1.005C7.553 4.898 7.103 4.452 7.1 3.9c0-.562 .448-1.01 1-1.01M4.96 5.39c.552 0 1 .448 1 1 .003 .552-.443 1.002-.995 1.005C4.413 7.398 3.963 6.952 3.96 6.4c0-.562 .448-1.01 1-1.01M3.23 9c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L2.23 10c0-.552 .448-1 1-1M3.23 13c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L2.23 14c0-.552 .448-1 1-1M4.96 16.61c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88l-.007-.127c0-.552 .448-1 1-1M8.1 19.11c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88l-.007-.127c0-.552 .448-1 1-1M12 20c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 21c0-.552 .448-1 1-1"),
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
        return _livePhoto!!
    }

private var _livePhoto: ImageVector? = null
