package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandGithub: ImageVector
    get() {
        if (_brandGithub != null) return _brandGithub!!
        _brandGithub = tablerFilledIcon(
            name = "BrandGithub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.315 2.1c.791-.113 1.9 .145 3.333 .966l.272 .161 .16 .1 .397-.083c1.514-.293 3.067-.32 4.59-.08l.456 .08 .396 .083 .161-.1c1.385-.84 2.487-1.17 3.322-1.148l.164 .008 .147 .017 .076 .014 .05 .011 .144 .047c.236 .097 .425 .281 .53 .514 .409 .912 .547 1.922 .397 2.91l-.047 .267-.046 .196 .123 .163c.574 .795 .93 1.728 1.03 2.707l.023 .295L21 9.5c0 3.855-1.659 5.883-4.644 6.68l-.245 .061-.132 .029 .014 .161 .008 .157 .004 .365-.002 .213L16 21c-0 .507-.38 .934-.883 .993L15 22h-6c-.507-0-.934-.38-.993-.883L8 21v-.734C6.182 20.526 4.97 19.842 3.89 18.388l-.535-.766c-.28-.396-.455-.579-.589-.644l-.048-.019c-.515-.167-.803-.714-.65-1.233 .153-.519 .691-.823 1.214-.685 .642 .188 1.074 .568 1.57 1.239l.538 .769c.76 1.079 1.36 1.459 2.609 1.191L8 17.562l-.018-.168c-.03-.274-.037-.549-.021-.824l.017-.185 .019-.12-.108-.024C4.913 15.531 3.186 13.668 3.014 10.102L3.004 9.792 3 9.5C3.001 8.417 3.317 7.357 3.908 6.449l.152-.222 .122-.163L4.137 5.868C3.957 4.99 4.007 4.079 4.282 3.226l.1-.282 .106-.253c.104-.232 .294-.416 .529-.514l.144-.047 .154-.03Z"),
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
        return _brandGithub!!
    }

private var _brandGithub: ImageVector? = null
