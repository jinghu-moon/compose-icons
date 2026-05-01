package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Suitcase: ImageVector
    get() {
        if (_suitcase != null) return _suitcase!!
        _suitcase = phosphorLightIcon(
            name = "Suitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 58.0f),
                    PathNode.LineTo(174.0f, 58.0f),
                    PathNode.LineTo(174.0f, 48.0f),
                    PathNode.CurveTo(174.0f, 35.849735f, 164.15027f, 26.0f, 152.0f, 26.0f),
                    PathNode.LineTo(104.0f, 26.0f),
                    PathNode.CurveTo(91.84974f, 26.0f, 82.0f, 35.849735f, 82.0f, 48.0f),
                    PathNode.LineTo(82.0f, 58.0f),
                    PathNode.LineTo(40.0f, 58.0f),
                    PathNode.CurveTo(32.268013f, 58.0f, 26.0f, 64.26801f, 26.0f, 72.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 72.0f),
                    PathNode.CurveTo(230.0f, 64.26801f, 223.73198f, 58.0f, 216.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 48.0f),
                    PathNode.CurveTo(94.0f, 42.477154f, 98.47715f, 38.0f, 104.0f, 38.0f),
                    PathNode.LineTo(152.0f, 38.0f),
                    PathNode.CurveTo(157.52284f, 38.0f, 162.0f, 42.477154f, 162.0f, 48.0f),
                    PathNode.LineTo(162.0f, 58.0f),
                    PathNode.LineTo(94.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 70.0f),
                    PathNode.LineTo(162.0f, 202.0f),
                    PathNode.LineTo(94.0f, 202.0f),
                    PathNode.LineTo(94.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 72.0f),
                    PathNode.CurveTo(38.0f, 70.89543f, 38.89543f, 70.0f, 40.0f, 70.0f),
                    PathNode.LineTo(82.0f, 70.0f),
                    PathNode.LineTo(82.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 201.10457f, 217.10457f, 202.0f, 216.0f, 202.0f),
                    PathNode.LineTo(174.0f, 202.0f),
                    PathNode.LineTo(174.0f, 70.0f),
                    PathNode.LineTo(216.0f, 70.0f),
                    PathNode.CurveTo(217.10457f, 70.0f, 218.0f, 70.89543f, 218.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
