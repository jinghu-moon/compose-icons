package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorLightIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.74f, 117.71f),
                    PathNode.LineTo(138.29f, 14.26f),
                    PathNode.CurveTo(132.60522f, 8.581262f, 123.394775f, 8.581262f, 117.71f, 14.26f),
                    PathNode.LineTo(14.26f, 117.71f),
                    PathNode.CurveTo(8.581262f, 123.394775f, 8.581262f, 132.60522f, 14.26f, 138.29f),
                    PathNode.LineTo(117.71f, 241.74f),
                    PathNode.LineTo(117.71f, 241.74f),
                    PathNode.CurveTo(123.394775f, 247.41873f, 132.60522f, 247.41873f, 138.29f, 241.74f),
                    PathNode.LineTo(241.74f, 138.29f),
                    PathNode.CurveTo(247.41873f, 132.60522f, 247.41873f, 123.394775f, 241.74f, 117.71f),
                    PathNode.Close,
                    PathNode.MoveTo(233.25f, 129.81f),
                    PathNode.LineTo(129.81f, 233.25f),
                    PathNode.CurveTo(128.8103f, 234.24948f, 127.1897f, 234.24948f, 126.19f, 233.25f),
                    PathNode.LineTo(126.19f, 233.25f),
                    PathNode.LineTo(22.75f, 129.81f),
                    PathNode.CurveTo(21.750513f, 128.8103f, 21.750513f, 127.1897f, 22.75f, 126.19f),
                    PathNode.LineTo(126.19f, 22.75f),
                    PathNode.CurveTo(127.1897f, 21.750513f, 128.8103f, 21.750513f, 129.81f, 22.75f),
                    PathNode.LineTo(233.25f, 126.19f),
                    PathNode.CurveTo(234.24948f, 127.1897f, 234.24948f, 128.8103f, 233.25f, 129.81f),
                    PathNode.Close,
                    PathNode.MoveTo(172.25f, 115.81f),
                    PathNode.CurveTo(174.58963f, 118.15254f, 174.58963f, 121.94746f, 172.25f, 124.29f),
                    PathNode.LineTo(148.25f, 148.29f),
                    PathNode.CurveTo(145.88593f, 150.49287f, 142.20192f, 150.42787f, 139.91702f, 148.14297f),
                    PathNode.CurveTo(137.63213f, 145.85808f, 137.56712f, 142.17409f, 139.77f, 139.81f),
                    PathNode.LineTo(153.51f, 126.0f),
                    PathNode.LineTo(112.0f, 126.0f),
                    PathNode.CurveTo(102.05888f, 126.0f, 94.0f, 134.05887f, 94.0f, 144.0f),
                    PathNode.LineTo(94.0f, 152.0f),
                    PathNode.CurveTo(94.0f, 155.3137f, 91.313705f, 158.0f, 88.0f, 158.0f),
                    PathNode.CurveTo(84.686295f, 158.0f, 82.0f, 155.3137f, 82.0f, 152.0f),
                    PathNode.LineTo(82.0f, 144.0f),
                    PathNode.CurveTo(82.0f, 127.43146f, 95.43146f, 114.0f, 112.0f, 114.0f),
                    PathNode.LineTo(153.51f, 114.0f),
                    PathNode.LineTo(139.76f, 100.24f),
                    PathNode.CurveTo(137.55713f, 97.87592f, 137.62213f, 94.191925f, 139.90703f, 91.90703f),
                    PathNode.CurveTo(142.19193f, 89.62213f, 145.87592f, 89.55713f, 148.24f, 91.76f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
