package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Meeple: ImageVector
    get() {
        if (_meeple != null) return _meeple!!
        _meeple = tablerFilledIcon(
            name = "Meeple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c2.486 0 3.713 1.766 3.955 4.1l.01 .124 .129 .036c3.17 .928 5.754 2.487 5.9 4.556L22 11c0 1.427-1.297 2.322-2.871 2.733l-.201 .049 .026 .03c.244 .276 .532 .603 .7 .797l.057 .066c.49 .573 .884 1.073 1.216 1.56C21.617 17.245 22 18.139 22 19c0 1.105-.895 2-2 2h-5c-1.043 0-1.344-.453-2.394-2.553-.29-.58-.448-.882-.593-1.118L12 17.307l-.013 .022c-.129 .21-.268 .472-.5 .935l-.093 .183C10.344 20.547 10.043 21 9 21h-5C2.895 21 2 20.105 2 19c0-.86 .384-1.755 1.073-2.765 .376-.542 .782-1.063 1.216-1.56 .152-.178 .482-.553 .757-.863l.025-.03-.2-.049C3.365 13.34 2.113 12.503 2.007 11.183L2 11C2 8.84 4.643 7.215 7.906 6.26l.128-.036 .011-.124C8.28 3.84 9.439 2.11 11.771 2.005Z"),
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
        return _meeple!!
    }

private var _meeple: ImageVector? = null
