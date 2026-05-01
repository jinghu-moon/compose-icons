package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpinnerGap: ImageVector
    get() {
        if (_spinnerGap != null) return _spinnerGap!!
        _spinnerGap = phosphorFillIcon(
            name = "SpinnerGap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 136.0f),
                    PathNode.CurveTo(43.581722f, 136.0f, 40.0f, 132.41827f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 123.58172f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.CurveTo(76.41828f, 120.0f, 80.0f, 123.58172f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 132.41827f, 76.41828f, 136.0f, 72.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.06f, 173.25f),
                    PathNode.LineTo(77.06f, 190.25f),
                    PathNode.CurveTo(73.93407f, 193.37593f, 68.86593f, 193.37593f, 65.74f, 190.25f),
                    PathNode.CurveTo(62.614067f, 187.12407f, 62.614067f, 182.05594f, 65.74f, 178.93f),
                    PathNode.LineTo(82.74f, 161.93f),
                    PathNode.CurveTo(85.885315f, 158.94177f, 90.83925f, 159.00519f, 93.90703f, 162.07297f),
                    PathNode.CurveTo(96.97481f, 165.14075f, 97.03823f, 170.09468f, 94.05f, 173.24f),
                    PathNode.Close,
                    PathNode.MoveTo(94.06f, 94.06f),
                    PathNode.CurveTo(90.93623f, 97.181725f, 85.87377f, 97.181725f, 82.75f, 94.06f),
                    PathNode.LineTo(65.75f, 77.06f),
                    PathNode.CurveTo(62.63235f, 73.92854f, 62.643547f, 68.86265f, 65.775f, 65.745f),
                    PathNode.CurveTo(68.906456f, 62.627354f, 73.97235f, 62.638542f, 77.09f, 65.77f),
                    PathNode.LineTo(94.09f, 82.77f),
                    PathNode.CurveTo(97.19014f, 85.89972f, 97.176735f, 90.9468f, 94.06f, 94.06f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 208.0f),
                    PathNode.CurveTo(136.0f, 212.41827f, 132.41827f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(123.58172f, 216.0f, 120.0f, 212.41827f, 120.0f, 208.0f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.CurveTo(120.0f, 179.58173f, 123.58172f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(132.41827f, 176.0f, 136.0f, 179.58173f, 136.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 76.41828f, 132.41827f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(123.58172f, 80.0f, 120.0f, 76.41828f, 120.0f, 72.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 43.581722f, 123.58172f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(132.41827f, 40.0f, 136.0f, 43.581722f, 136.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.23f, 190.23f),
                    PathNode.CurveTo(188.72945f, 191.73222f, 186.69327f, 192.5763f, 184.57f, 192.5763f),
                    PathNode.CurveTo(182.44673f, 192.5763f, 180.41055f, 191.73222f, 178.91f, 190.23f),
                    PathNode.LineTo(161.91f, 173.23f),
                    PathNode.CurveTo(158.92178f, 170.08469f, 158.9852f, 165.13075f, 162.05298f, 162.06297f),
                    PathNode.CurveTo(165.12076f, 158.9952f, 170.07469f, 158.93176f, 173.22f, 161.92f),
                    PathNode.LineTo(190.22f, 178.92f),
                    PathNode.CurveTo(193.34448f, 182.04102f, 193.34897f, 187.10347f, 190.23f, 190.23f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.CurveTo(179.58173f, 136.0f, 176.0f, 132.41827f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 123.58172f, 179.58173f, 120.0f, 184.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 123.58172f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 132.41827f, 212.41827f, 136.0f, 208.0f, 136.0f),
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
        return _spinnerGap!!
    }

private var _spinnerGap: ImageVector? = null
