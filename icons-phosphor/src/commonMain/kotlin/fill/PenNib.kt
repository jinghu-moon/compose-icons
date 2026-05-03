package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorFillIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.31f, 81.36f),
                    PathNode.LineTo(174.63f, 12.68f),
                    PathNode.CurveTo(171.62932f, 9.678628f, 167.5591f, 7.992417f, 163.315f, 7.992417f),
                    PathNode.CurveTo(159.0709f, 7.992417f, 155.00069f, 9.678628f, 152.0f, 12.68f),
                    PathNode.LineTo(123.56f, 41.12f),
                    PathNode.LineTo(65.56f, 62.88f),
                    PathNode.CurveTo(60.195816f, 64.875984f, 56.30636f, 69.58528f, 55.36f, 75.23f),
                    PathNode.LineTo(34.59f, 199.83f),
                    PathNode.CurveTo(34.304317f, 201.54416f, 35.158108f, 203.24667f, 36.702747f, 204.04295f),
                    PathNode.CurveTo(38.247387f, 204.83923f, 40.129448f, 204.54707f, 41.36f, 203.32f),
                    PathNode.LineTo(98.36f, 146.32f),
                    PathNode.CurveTo(96.55403f, 142.56267f, 95.764465f, 138.3976f, 96.07f, 134.24f),
                    PathNode.CurveTo(96.83327f, 123.74068f, 104.34948f, 114.96429f, 114.60656f, 112.59558f),
                    PathNode.CurveTo(124.86363f, 110.22688f, 135.46706f, 114.81885f, 140.75679f, 123.92033f),
                    PathNode.CurveTo(146.04654f, 133.0218f, 144.78773f, 144.50806f, 137.6523f, 152.24782f),
                    PathNode.CurveTo(130.51686f, 159.98758f, 119.170586f, 162.17401f, 109.67f, 157.64f),
                    PathNode.LineTo(52.67f, 214.64f),
                    PathNode.CurveTo(51.44293f, 215.87056f, 51.150772f, 217.75261f, 51.94705f, 219.29726f),
                    PathNode.CurveTo(52.743324f, 220.84189f, 54.44584f, 221.69568f, 56.16f, 221.41f),
                    PathNode.LineTo(180.77f, 200.64f),
                    PathNode.CurveTo(186.40532f, 199.70107f, 191.11244f, 195.82866f, 193.12f, 190.48f),
                    PathNode.LineTo(214.89f, 132.41f),
                    PathNode.LineTo(243.31f, 104.0f),
                    PathNode.CurveTo(246.31137f, 100.99931f, 247.99759f, 96.92911f, 247.99759f, 92.685f),
                    PathNode.CurveTo(247.99759f, 88.4409f, 246.31137f, 84.37069f, 243.31f, 81.37f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 116.68f),
                    PathNode.LineTo(139.32f, 48.0f),
                    PathNode.LineTo(163.32f, 24.0f),
                    PathNode.LineTo(232.0f, 92.68f),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
