package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhoneOff: ImageVector
    get() {
        if (_phoneOff != null) return _phoneOff!!
        _phoneOff = tablerOutlineIcon(
            name = "PhoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 21.000 L 21.000 3.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 5.831 14.161 C 4.154 11.753 3.175 8.929 3.000 6.000 C 3.000 4.895 3.895 4.000 5.000 4.000 L 9.000 4.000 L 11.000 9.000 L 8.500 10.500 C 8.608 10.720 8.723 10.935 8.845 11.145M 10.596 13.422 C 11.439 14.262 12.418 14.966 13.500 15.500 L 15.000 13.000 L 20.000 15.000 L 20.000 19.000 C 20.000 20.105 19.105 21.000 18.000 21.000 C 14.098 20.766 10.418 19.109 7.656 16.343"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _phoneOff!!
    }

private var _phoneOff: ImageVector? = null
