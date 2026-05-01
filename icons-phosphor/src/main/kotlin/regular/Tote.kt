package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tote: ImageVector
    get() {
        if (_tote != null) return _tote!!
        _tote = phosphorRegularIcon(
            name = "Tote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 69.4f),
                    PathNode.CurveTo(232.93092f, 65.955215f, 228.53365f, 63.989548f, 223.92f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(176.0f, 37.490334f, 154.50967f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(101.49033f, 16.0f, 80.0f, 37.490334f, 80.0f, 64.0f),
                    PathNode.LineTo(32.08f, 64.0f),
                    PathNode.CurveTo(27.49425f, 64.01236f, 23.130527f, 65.976036f, 20.08f, 69.4f),
                    PathNode.CurveTo(17.054789f, 72.811424f, 15.628744f, 77.35149f, 16.16f, 81.88f),
                    PathNode.LineTo(30.42f, 201.88f),
                    PathNode.CurveTo(31.377638f, 209.97533f, 38.268425f, 216.05644f, 46.42f, 216.0f),
                    PathNode.LineTo(209.67f, 216.0f),
                    PathNode.CurveTo(217.82158f, 216.05644f, 224.71236f, 209.97533f, 225.67f, 201.88f),
                    PathNode.LineTo(239.93f, 81.88f),
                    PathNode.CurveTo(240.45856f, 77.35001f, 239.02881f, 72.80976f, 236.0f, 69.4f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(145.67311f, 32.0f, 160.0f, 46.32689f, 160.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.CurveTo(96.0f, 46.32689f, 110.32689f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(209.76f, 200.0f),
                    PathNode.CurveTo(209.73096f, 200.0107f, 209.69904f, 200.0107f, 209.67f, 200.0f),
                    PathNode.LineTo(46.25f, 200.0f),
                    PathNode.LineTo(32.08f, 80.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 108.41828f, 83.58172f, 112.0f, 88.0f, 112.0f),
                    PathNode.CurveTo(92.41828f, 112.0f, 96.0f, 108.41828f, 96.0f, 104.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 108.41828f, 163.58173f, 112.0f, 168.0f, 112.0f),
                    PathNode.CurveTo(172.41827f, 112.0f, 176.0f, 108.41828f, 176.0f, 104.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tote!!
    }

private var _tote: ImageVector? = null
