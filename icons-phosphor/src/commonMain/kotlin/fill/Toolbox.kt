package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorFillIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(176.0f, 42.745167f, 165.25484f, 32.0f, 152.0f, 32.0f),
                    PathNode.LineTo(104.0f, 32.0f),
                    PathNode.CurveTo(90.74516f, 32.0f, 80.0f, 42.745167f, 80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 64.0f),
                    PathNode.LineTo(32.0f, 64.0f),
                    PathNode.CurveTo(23.163445f, 64.0f, 16.0f, 71.163445f, 16.0f, 80.0f),
                    PathNode.LineTo(16.0f, 108.0f),
                    PathNode.CurveTo(16.0f, 110.20914f, 17.790861f, 112.0f, 20.0f, 112.0f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.LineTo(64.0f, 96.27f),
                    PathNode.CurveTo(63.931744f, 91.97935f, 67.194534f, 88.36713f, 71.47f, 88.0f),
                    PathNode.CurveTo(73.68197f, 87.85313f, 75.85571f, 88.63069f, 77.47269f, 90.147194f),
                    PathNode.CurveTo(79.08966f, 91.6637f, 80.00487f, 93.783165f, 80.0f, 96.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.LineTo(176.0f, 112.0f),
                    PathNode.LineTo(176.0f, 96.27f),
                    PathNode.CurveTo(175.93175f, 91.97935f, 179.19453f, 88.36713f, 183.47f, 88.0f),
                    PathNode.CurveTo(185.68199f, 87.85313f, 187.85571f, 88.63069f, 189.47269f, 90.147194f),
                    PathNode.CurveTo(191.08966f, 91.6637f, 192.00487f, 93.783165f, 192.0f, 96.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.LineTo(236.0f, 112.0f),
                    PathNode.CurveTo(238.20914f, 112.0f, 240.0f, 110.20914f, 240.0f, 108.0f),
                    PathNode.LineTo(240.0f, 80.0f),
                    PathNode.CurveTo(240.0f, 71.163445f, 232.83656f, 64.0f, 224.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.CurveTo(96.0f, 51.581722f, 99.58172f, 48.0f, 104.0f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(156.41827f, 48.0f, 160.0f, 51.581722f, 160.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 132.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 200.83656f, 232.83656f, 208.0f, 224.0f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(23.163445f, 208.0f, 16.0f, 200.83656f, 16.0f, 192.0f),
                    PathNode.LineTo(16.0f, 132.0f),
                    PathNode.CurveTo(16.0f, 129.79086f, 17.790861f, 128.0f, 20.0f, 128.0f),
                    PathNode.LineTo(64.0f, 128.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(63.99513f, 146.21684f, 64.91034f, 148.3363f, 66.52731f, 149.85281f),
                    PathNode.CurveTo(68.14429f, 151.36931f, 70.31803f, 152.14687f, 72.53f, 152.0f),
                    PathNode.CurveTo(76.805466f, 151.63287f, 80.06826f, 148.02065f, 80.0f, 143.73f),
                    PathNode.LineTo(80.0f, 128.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.CurveTo(175.99513f, 146.21684f, 176.91034f, 148.3363f, 178.52731f, 149.85281f),
                    PathNode.CurveTo(180.14429f, 151.36931f, 182.31801f, 152.14687f, 184.53f, 152.0f),
                    PathNode.CurveTo(188.79767f, 151.63339f, 192.05766f, 148.033f, 192.0f, 143.75f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.LineTo(236.0f, 128.0f),
                    PathNode.CurveTo(238.20914f, 128.0f, 240.0f, 129.79086f, 240.0f, 132.0f),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
