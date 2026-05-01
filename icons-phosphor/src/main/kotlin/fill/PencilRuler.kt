package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorFillIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(151.16344f, 224.0f, 144.0f, 216.83656f, 144.0f, 208.0f),
                    PathNode.LineTo(144.0f, 180.0f),
                    PathNode.CurveTo(144.0f, 177.79086f, 145.79086f, 176.0f, 148.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.CurveTo(186.21684f, 176.00487f, 188.3363f, 175.08966f, 189.85281f, 173.47269f),
                    PathNode.CurveTo(191.36931f, 171.85571f, 192.14687f, 169.68199f, 192.0f, 167.47f),
                    PathNode.CurveTo(191.62871f, 163.20465f, 188.03116f, 159.94724f, 183.75f, 160.0f),
                    PathNode.LineTo(148.0f, 160.0f),
                    PathNode.CurveTo(145.79086f, 160.0f, 144.0f, 158.20914f, 144.0f, 156.0f),
                    PathNode.LineTo(144.0f, 140.0f),
                    PathNode.CurveTo(144.0f, 137.79086f, 145.79086f, 136.0f, 148.0f, 136.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.CurveTo(186.21684f, 136.00487f, 188.3363f, 135.08966f, 189.85281f, 133.47269f),
                    PathNode.CurveTo(191.36931f, 131.85571f, 192.14687f, 129.68198f, 192.0f, 127.47f),
                    PathNode.CurveTo(191.62871f, 123.20465f, 188.03116f, 119.947235f, 183.75f, 120.0f),
                    PathNode.LineTo(148.0f, 120.0f),
                    PathNode.CurveTo(145.79086f, 120.0f, 144.0f, 118.20914f, 144.0f, 116.0f),
                    PathNode.LineTo(144.0f, 100.0f),
                    PathNode.CurveTo(144.0f, 97.79086f, 145.79086f, 96.0f, 148.0f, 96.0f),
                    PathNode.LineTo(184.0f, 96.0f),
                    PathNode.CurveTo(186.21684f, 96.00487f, 188.3363f, 95.08966f, 189.85281f, 93.47269f),
                    PathNode.CurveTo(191.36931f, 91.85571f, 192.14687f, 89.68197f, 192.0f, 87.47f),
                    PathNode.CurveTo(191.62817f, 83.19688f, 188.0188f, 79.93666f, 183.73f, 80.0f),
                    PathNode.LineTo(148.0f, 80.0f),
                    PathNode.CurveTo(145.79086f, 80.0f, 144.0f, 78.20914f, 144.0f, 76.0f),
                    PathNode.LineTo(144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 39.163445f, 151.16344f, 32.0f, 160.0f, 32.0f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(216.83656f, 32.0f, 224.0f, 39.163445f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(109.66f, 58.34f),
                    PathNode.CurveTo(111.15991f, 59.841576f, 112.00167f, 61.87763f, 112.0f, 64.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.CurveTo(112.0f, 216.83656f, 104.836555f, 224.0f, 96.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(31.998331f, 61.87763f, 32.84009f, 59.841576f, 34.34f, 58.34f),
                    PathNode.LineTo(66.34f, 26.34f),
                    PathNode.CurveTo(67.840546f, 24.837784f, 69.876724f, 23.993708f, 72.0f, 23.993708f),
                    PathNode.CurveTo(74.123276f, 23.993708f, 76.159454f, 24.837784f, 77.66f, 26.34f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 80.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.LineTo(96.0f, 184.0f),
                    PathNode.LineTo(96.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(51.31f, 64.0f),
                    PathNode.LineTo(92.69f, 64.0f),
                    PathNode.LineTo(72.0f, 43.31f),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
