package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowLeft: ImageVector
    get() {
        if (_circleArrowLeft != null) return _circleArrowLeft!!
        _circleArrowLeft = tablerFilledIcon(
            name = "CircleArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.463-.004 9.918 4.376 10.007 9.838 .089 5.462-4.223 9.984-9.683 10.157L12 22l-.324-.005C6.216 21.822 1.905 17.3 1.993 11.838 2.082 6.376 6.537 1.996 12 2ZM12.707 7.293c-.391-.39-1.023-.39-1.414 0l-4 4c-.03 .03-.057 .061-.083 .094l-.064 .092-.052 .098-.044 .11-.03 .112-.017 .126L7 12l.004 .09 .007 .058 .025 .118 .035 .105 .054 .113 .043 .07 .071 .095 .054 .058 4 4 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367L10.415 13h5.585l.117-.007c.525-.062 .911-.523 .88-1.052C16.966 11.413 16.529 11.001 16 11h-5.586L12.707 8.707l.083-.094c.309-.398 .273-.964-.083-1.32Z"),
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
        return _circleArrowLeft!!
    }

private var _circleArrowLeft: ImageVector? = null
