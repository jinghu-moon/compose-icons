package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleTaiChi: ImageVector
    get() {
        if (_personSimpleTaiChi != null) return _personSimpleTaiChi!!
        _personSimpleTaiChi = phosphorFillIcon(
            name = "PersonSimpleTaiChi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 48.0f),
                    PathNode.CurveTo(96.0f, 30.326887f, 110.32689f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(145.67311f, 16.0f, 160.0f, 30.326887f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 65.67311f, 145.67311f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(110.32689f, 80.0f, 96.0f, 65.67311f, 96.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 96.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(35.581722f, 96.0f, 32.0f, 99.58172f, 32.0f, 104.0f),
                    PathNode.CurveTo(32.0f, 108.41828f, 35.581722f, 112.0f, 40.0f, 112.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.LineTo(120.0f, 140.44f),
                    PathNode.LineTo(42.65f, 210.05f),
                    PathNode.CurveTo(39.350098f, 213.00473f, 39.07028f, 218.0751f, 42.025f, 221.37502f),
                    PathNode.CurveTo(44.979725f, 224.6749f, 50.0501f, 224.95473f, 53.35f, 222.0f),
                    PathNode.LineTo(129.55f, 153.42f),
                    PathNode.LineTo(176.0f, 173.28f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 220.41827f, 179.58173f, 224.0f, 184.0f, 224.0f),
                    PathNode.CurveTo(188.41827f, 224.0f, 192.0f, 220.41827f, 192.0f, 216.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.CurveTo(191.9985f, 164.8006f, 190.09094f, 161.90976f, 187.15f, 160.65f),
                    PathNode.LineTo(136.0f, 138.72f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(220.41827f, 112.0f, 224.0f, 108.41828f, 224.0f, 104.0f),
                    PathNode.CurveTo(224.0f, 99.58172f, 220.41827f, 96.0f, 216.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _personSimpleTaiChi!!
    }

private var _personSimpleTaiChi: ImageVector? = null
