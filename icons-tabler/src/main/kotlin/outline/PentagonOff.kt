package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PentagonOff: ImageVector
    get() {
        if (_pentagonOff != null) return _pentagonOff!!
        _pentagonOff = tablerOutlineIcon(
            name = "PentagonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.133 4.133 L 10.837 2.168 C 11.530 1.664 12.470 1.664 13.163 2.168 L 21.184 7.996 C 21.878 8.500 22.168 9.393 21.903 10.208 L 20.016 16.016M 19.035 19.036 L 18.839 19.638 C 18.574 20.453 17.815 21.005 16.958 21.005 L 7.042 21.005 C 6.185 21.005 5.426 20.453 5.161 19.638 L 2.097 10.208 C 1.832 9.393 2.122 8.500 2.816 7.996 L 5.810 5.820"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _pentagonOff!!
    }

private var _pentagonOff: ImageVector? = null
