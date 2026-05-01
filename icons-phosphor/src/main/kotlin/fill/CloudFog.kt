package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorFillIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 232.0f),
                    PathNode.CurveTo(168.0f, 236.41827f, 164.41827f, 240.0f, 160.0f, 240.0f),
                    PathNode.LineTo(104.0f, 240.0f),
                    PathNode.CurveTo(99.58172f, 240.0f, 96.0f, 236.41827f, 96.0f, 232.0f),
                    PathNode.CurveTo(96.0f, 227.58173f, 99.58172f, 224.0f, 104.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(164.41827f, 224.0f, 168.0f, 227.58173f, 168.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(128.0f, 195.58173f, 124.41828f, 192.0f, 120.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(67.58172f, 192.0f, 64.0f, 195.58173f, 64.0f, 200.0f),
                    PathNode.CurveTo(64.0f, 204.41827f, 67.58172f, 208.0f, 72.0f, 208.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.CurveTo(124.41828f, 208.0f, 128.0f, 204.41827f, 128.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(155.58173f, 192.0f, 152.0f, 195.58173f, 152.0f, 200.0f),
                    PathNode.CurveTo(152.0f, 204.41827f, 155.58173f, 208.0f, 160.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(188.41827f, 208.0f, 192.0f, 204.41827f, 192.0f, 200.0f),
                    PathNode.CurveTo(192.0f, 195.58173f, 188.41827f, 192.0f, 184.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(231.87f, 95.55f),
                    PathNode.CurveTo(229.51231f, 55.227207f, 196.02525f, 23.792767f, 155.63405f, 23.987032f),
                    PathNode.CurveTo(115.24286f, 24.181297f, 82.05971f, 55.936394f, 80.09f, 96.28f),
                    PathNode.CurveTo(79.847855f, 100.58258f, 76.30921f, 103.9594f, 72.0f, 104.0f),
                    PathNode.LineTo(71.4f, 104.0f),
                    PathNode.CurveTo(67.008675f, 103.6076f, 63.72794f, 99.79042f, 64.0f, 95.39f),
                    PathNode.CurveTo(64.27796f, 89.827736f, 65.05779f, 84.30195f, 66.33f, 78.88f),
                    PathNode.CurveTo(66.664024f, 77.49454f, 66.23567f, 76.035995f, 65.20552f, 75.05117f),
                    PathNode.CurveTo(64.17537f, 74.06635f, 62.699043f, 73.70401f, 61.33f, 74.1f),
                    PathNode.CurveTo(39.083782f, 80.672554f, 23.864332f, 101.163574f, 24.0f, 124.36f),
                    PathNode.CurveTo(24.2f, 153.07f, 48.12f, 176.0f, 76.84f, 176.0f),
                    PathNode.LineTo(156.0f, 176.0f),
                    PathNode.CurveTo(176.92166f, 175.97679f, 196.91046f, 167.33893f, 211.26472f, 152.11815f),
                    PathNode.CurveTo(225.61899f, 136.89737f, 233.07175f, 116.43713f, 231.87f, 95.55f),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
