package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorLightIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 40.0f),
                    PathNode.LineTo(222.0f, 216.0f),
                    PathNode.CurveTo(222.0f, 219.3137f, 219.3137f, 222.0f, 216.0f, 222.0f),
                    PathNode.CurveTo(212.6863f, 222.0f, 210.0f, 219.3137f, 210.0f, 216.0f),
                    PathNode.LineTo(210.0f, 40.0f),
                    PathNode.CurveTo(210.0f, 36.68629f, 212.6863f, 34.0f, 216.0f, 34.0f),
                    PathNode.CurveTo(219.3137f, 34.0f, 222.0f, 36.68629f, 222.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 64.0f),
                    PathNode.LineTo(190.0f, 104.0f),
                    PathNode.CurveTo(190.0f, 111.73199f, 183.73198f, 118.0f, 176.0f, 118.0f),
                    PathNode.LineTo(80.0f, 118.0f),
                    PathNode.CurveTo(72.26801f, 118.0f, 66.0f, 111.73199f, 66.0f, 104.0f),
                    PathNode.LineTo(66.0f, 64.0f),
                    PathNode.CurveTo(66.0f, 56.268013f, 72.26801f, 50.0f, 80.0f, 50.0f),
                    PathNode.LineTo(176.0f, 50.0f),
                    PathNode.CurveTo(183.73198f, 50.0f, 190.0f, 56.268013f, 190.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 64.0f),
                    PathNode.CurveTo(178.0f, 62.89543f, 177.10457f, 62.0f, 176.0f, 62.0f),
                    PathNode.LineTo(80.0f, 62.0f),
                    PathNode.CurveTo(78.89543f, 62.0f, 78.0f, 62.89543f, 78.0f, 64.0f),
                    PathNode.LineTo(78.0f, 104.0f),
                    PathNode.CurveTo(78.0f, 105.10457f, 78.89543f, 106.0f, 80.0f, 106.0f),
                    PathNode.LineTo(176.0f, 106.0f),
                    PathNode.CurveTo(177.10457f, 106.0f, 178.0f, 105.10457f, 178.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 152.0f),
                    PathNode.LineTo(190.0f, 192.0f),
                    PathNode.CurveTo(190.0f, 199.73198f, 183.73198f, 206.0f, 176.0f, 206.0f),
                    PathNode.LineTo(40.0f, 206.0f),
                    PathNode.CurveTo(32.268013f, 206.0f, 26.0f, 199.73198f, 26.0f, 192.0f),
                    PathNode.LineTo(26.0f, 152.0f),
                    PathNode.CurveTo(26.0f, 144.26802f, 32.268013f, 138.0f, 40.0f, 138.0f),
                    PathNode.LineTo(176.0f, 138.0f),
                    PathNode.CurveTo(183.73198f, 138.0f, 190.0f, 144.26802f, 190.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 152.0f),
                    PathNode.CurveTo(178.0f, 150.89543f, 177.10457f, 150.0f, 176.0f, 150.0f),
                    PathNode.LineTo(40.0f, 150.0f),
                    PathNode.CurveTo(38.89543f, 150.0f, 38.0f, 150.89543f, 38.0f, 152.0f),
                    PathNode.LineTo(38.0f, 192.0f),
                    PathNode.CurveTo(38.0f, 193.10457f, 38.89543f, 194.0f, 40.0f, 194.0f),
                    PathNode.LineTo(176.0f, 194.0f),
                    PathNode.CurveTo(177.10457f, 194.0f, 178.0f, 193.10457f, 178.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
