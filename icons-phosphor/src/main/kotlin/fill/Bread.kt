package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorFillIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(29.067947f, 40.011482f, 12.73675f, 53.293922f, 8.868236f, 71.82652f),
                    PathNode.CurveTo(4.999721f, 90.35912f, 14.653501f, 109.0657f, 32.0f, 116.65f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 208.83656f, 39.163445f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(208.83656f, 216.0f, 216.0f, 208.83656f, 216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 116.65f),
                    PathNode.CurveTo(233.3465f, 109.0657f, 243.00027f, 90.35912f, 239.13176f, 71.82652f),
                    PathNode.CurveTo(235.26324f, 53.293922f, 218.93205f, 40.011482f, 200.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 104.0f),
                    PathNode.CurveTo(139.58173f, 104.0f, 136.0f, 107.58172f, 136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 116.41828f, 139.58173f, 120.0f, 144.0f, 120.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.CurveTo(52.418278f, 120.0f, 56.0f, 116.41828f, 56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 107.58172f, 52.418278f, 104.0f, 48.0f, 104.0f),
                    PathNode.CurveTo(34.745167f, 104.0f, 24.0f, 93.25484f, 24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 66.74516f, 34.745167f, 56.0f, 48.0f, 56.0f),
                    PathNode.LineTo(144.0f, 56.0f),
                    PathNode.CurveTo(157.25484f, 56.0f, 168.0f, 66.74516f, 168.0f, 80.0f),
                    PathNode.CurveTo(168.0f, 93.25484f, 157.25484f, 104.0f, 144.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bread!!
    }

private var _bread: ImageVector? = null
