package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorDuotoneIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 93.25484f, 141.25484f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(114.74516f, 104.0f, 104.0f, 93.25484f, 104.0f, 80.0f),
                    PathNode.CurveTo(104.0f, 66.74516f, 114.74516f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(141.25484f, 56.0f, 152.0f, 66.74516f, 152.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 152.0f),
                    PathNode.CurveTo(26.745167f, 152.0f, 16.0f, 162.74516f, 16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 189.25484f, 26.745167f, 200.0f, 40.0f, 200.0f),
                    PathNode.CurveTo(53.254833f, 200.0f, 64.0f, 189.25484f, 64.0f, 176.0f),
                    PathNode.CurveTo(64.0f, 162.74516f, 53.254833f, 152.0f, 40.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.CurveTo(202.74516f, 152.0f, 192.0f, 162.74516f, 192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 189.25484f, 202.74516f, 200.0f, 216.0f, 200.0f),
                    PathNode.CurveTo(229.25484f, 200.0f, 240.0f, 189.25484f, 240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 162.74516f, 229.25484f, 152.0f, 216.0f, 152.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.07f, 144.41f),
                    PathNode.CurveTo(215.12984f, 121.30725f, 200.8584f, 101.21613f, 181.0f, 88.0f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(244.41827f, 88.0f, 248.0f, 84.41828f, 248.0f, 80.0f),
                    PathNode.CurveTo(248.0f, 75.58172f, 244.41827f, 72.0f, 240.0f, 72.0f),
                    PathNode.LineTo(159.0f, 72.0f),
                    PathNode.CurveTo(155.37465f, 57.840683f, 142.61607f, 47.937252f, 128.0f, 47.937252f),
                    PathNode.CurveTo(113.38393f, 47.937252f, 100.62536f, 57.840683f, 97.0f, 72.0f),
                    PathNode.LineTo(16.0f, 72.0f),
                    PathNode.CurveTo(11.581722f, 72.0f, 8.0f, 75.58172f, 8.0f, 80.0f),
                    PathNode.CurveTo(8.0f, 84.41828f, 11.581722f, 88.0f, 16.0f, 88.0f),
                    PathNode.LineTo(75.0f, 88.0f),
                    PathNode.CurveTo(55.14159f, 101.21613f, 40.87017f, 121.30725f, 34.93f, 144.41f),
                    PathNode.CurveTo(19.039307f, 146.94553f, 7.503191f, 160.88713f, 7.986603f, 176.97157f),
                    PathNode.CurveTo(8.470015f, 193.05602f, 20.82257f, 206.27966f, 36.836853f, 207.8563f),
                    PathNode.CurveTo(52.85114f, 209.43294f, 67.54532f, 198.8721f, 71.15614f, 183.19075f),
                    PathNode.CurveTo(74.76696f, 167.5094f, 66.171135f, 151.58575f, 51.08f, 146.0f),
                    PathNode.CurveTo(58.041225f, 121.99843f, 75.74213f, 102.58359f, 99.0f, 93.44f),
                    PathNode.CurveTo(104.2424f, 104.74387f, 115.56966f, 111.97675f, 128.03f, 111.97675f),
                    PathNode.CurveTo(140.49034f, 111.97675f, 151.8176f, 104.74387f, 157.06f, 93.44f),
                    PathNode.CurveTo(180.29489f, 102.598785f, 197.97144f, 122.01123f, 204.92f, 146.0f),
                    PathNode.CurveTo(189.82167f, 151.56683f, 181.20583f, 167.47993f, 184.7972f, 183.16595f),
                    PathNode.CurveTo(188.38858f, 198.85197f, 203.06992f, 209.43108f, 219.08632f, 207.87407f),
                    PathNode.CurveTo(235.1027f, 206.31706f, 247.47156f, 193.10829f, 247.97444f, 177.02426f),
                    PathNode.CurveTo(248.47734f, 160.94023f, 236.95784f, 146.98456f, 221.07f, 144.43f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 184.83656f, 48.836555f, 192.0f, 40.0f, 192.0f),
                    PathNode.CurveTo(31.163445f, 192.0f, 24.0f, 184.83656f, 24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 167.16344f, 31.163445f, 160.0f, 40.0f, 160.0f),
                    PathNode.CurveTo(48.836555f, 160.0f, 56.0f, 167.16344f, 56.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(119.163445f, 96.0f, 112.0f, 88.836555f, 112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 71.163445f, 119.163445f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(136.83656f, 64.0f, 144.0f, 71.163445f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 88.836555f, 136.83656f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.CurveTo(207.16344f, 192.0f, 200.0f, 184.83656f, 200.0f, 176.0f),
                    PathNode.CurveTo(200.0f, 167.16344f, 207.16344f, 160.0f, 216.0f, 160.0f),
                    PathNode.CurveTo(224.83656f, 160.0f, 232.0f, 167.16344f, 232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 184.83656f, 224.83656f, 192.0f, 216.0f, 192.0f),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
