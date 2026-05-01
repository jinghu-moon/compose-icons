package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorFillIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.CurveTo(150.32689f, 48.0f, 136.0f, 62.32689f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 167.73f),
                    PathNode.CurveTo(136.05766f, 172.013f, 132.79767f, 175.61339f, 128.53f, 175.98f),
                    PathNode.CurveTo(126.31803f, 176.12688f, 124.14429f, 175.34932f, 122.52731f, 173.83281f),
                    PathNode.CurveTo(120.91034f, 172.3163f, 119.99513f, 170.19684f, 120.0f, 167.98f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 62.32689f, 105.67311f, 48.0f, 88.0f, 48.0f),
                    PathNode.LineTo(24.0f, 48.0f),
                    PathNode.CurveTo(19.581722f, 48.0f, 16.0f, 51.581722f, 16.0f, 56.0f),
                    PathNode.LineTo(16.0f, 200.0f),
                    PathNode.CurveTo(16.0f, 204.41827f, 19.581722f, 208.0f, 24.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(109.23144f, 207.99995f, 119.96692f, 218.7086f, 120.0f, 231.94f),
                    PathNode.CurveTo(119.934425f, 235.28734f, 121.98593f, 238.3125f, 125.12f, 239.49f),
                    PathNode.CurveTo(127.5848f, 240.44112f, 130.36024f, 240.114f, 132.53639f, 238.6159f),
                    PathNode.CurveTo(134.71252f, 237.11781f, 136.00871f, 234.64194f, 136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 218.74516f, 146.74516f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(236.41827f, 208.0f, 240.0f, 204.41827f, 240.0f, 200.0f),
                    PathNode.LineTo(240.0f, 56.0f),
                    PathNode.CurveTo(240.0f, 51.581722f, 236.41827f, 48.0f, 232.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 168.0f),
                    PathNode.LineTo(168.27f, 168.0f),
                    PathNode.CurveTo(163.987f, 168.05766f, 160.38661f, 164.79767f, 160.02f, 160.53f),
                    PathNode.CurveTo(159.87312f, 158.31801f, 160.65068f, 156.14429f, 162.16719f, 154.52731f),
                    PathNode.CurveTo(163.6837f, 152.91034f, 165.80316f, 151.99513f, 168.02f, 152.0f),
                    PathNode.LineTo(207.75f, 152.0f),
                    PathNode.CurveTo(212.033f, 151.94234f, 215.63339f, 155.20233f, 216.0f, 159.47f),
                    PathNode.CurveTo(216.14687f, 161.68199f, 215.36931f, 163.85571f, 213.85281f, 165.47269f),
                    PathNode.CurveTo(212.3363f, 167.08966f, 210.21684f, 168.00487f, 208.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(168.27f, 136.0f),
                    PathNode.CurveTo(163.987f, 136.05766f, 160.38661f, 132.79767f, 160.02f, 128.53f),
                    PathNode.CurveTo(159.87312f, 126.31803f, 160.65068f, 124.14429f, 162.16719f, 122.52731f),
                    PathNode.CurveTo(163.6837f, 120.91034f, 165.80316f, 119.99513f, 168.02f, 120.0f),
                    PathNode.LineTo(207.75f, 120.0f),
                    PathNode.CurveTo(212.033f, 119.94234f, 215.63339f, 123.20232f, 216.0f, 127.47f),
                    PathNode.CurveTo(216.14687f, 129.68198f, 215.36931f, 131.85571f, 213.85281f, 133.47269f),
                    PathNode.CurveTo(212.3363f, 135.08966f, 210.21684f, 136.00487f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 104.0f),
                    PathNode.LineTo(168.27f, 104.0f),
                    PathNode.CurveTo(163.97935f, 104.06826f, 160.36713f, 100.805466f, 160.0f, 96.53f),
                    PathNode.CurveTo(159.85313f, 94.31803f, 160.63069f, 92.14429f, 162.14719f, 90.52731f),
                    PathNode.CurveTo(163.6637f, 88.91034f, 165.78316f, 87.99513f, 168.0f, 88.0f),
                    PathNode.LineTo(207.73f, 88.0f),
                    PathNode.CurveTo(212.02065f, 87.93174f, 215.63287f, 91.194534f, 216.0f, 95.47f),
                    PathNode.CurveTo(216.14687f, 97.68197f, 215.36931f, 99.85571f, 213.85281f, 101.47269f),
                    PathNode.CurveTo(212.3363f, 103.08966f, 210.21684f, 104.00487f, 208.0f, 104.0f),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
