package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorBoldIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 120.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.CurveTo(32.0f, 174.62741f, 26.627417f, 180.0f, 20.0f, 180.0f),
                    PathNode.CurveTo(13.372583f, 180.0f, 8.0f, 174.62741f, 8.0f, 168.0f),
                    PathNode.LineTo(8.0f, 120.0f),
                    PathNode.CurveTo(8.0f, 113.37258f, 13.372583f, 108.0f, 20.0f, 108.0f),
                    PathNode.CurveTo(26.627417f, 108.0f, 32.0f, 113.37258f, 32.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 84.0f),
                    PathNode.CurveTo(53.37258f, 84.0f, 48.0f, 89.37258f, 48.0f, 96.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.CurveTo(48.0f, 198.62741f, 53.37258f, 204.0f, 60.0f, 204.0f),
                    PathNode.CurveTo(66.62742f, 204.0f, 72.0f, 198.62741f, 72.0f, 192.0f),
                    PathNode.LineTo(72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 89.37258f, 66.62742f, 84.0f, 60.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 44.0f),
                    PathNode.CurveTo(93.37258f, 44.0f, 88.0f, 49.37258f, 88.0f, 56.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.CurveTo(88.0f, 198.62741f, 93.37258f, 204.0f, 100.0f, 204.0f),
                    PathNode.CurveTo(106.62742f, 204.0f, 112.0f, 198.62741f, 112.0f, 192.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.CurveTo(112.0f, 49.37258f, 106.62742f, 44.0f, 100.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.34f, 103.33f),
                    PathNode.CurveTo(214.40787f, 64.15499f, 179.96999f, 35.9949f, 140.0f, 36.0f),
                    PathNode.CurveTo(133.37259f, 36.0f, 128.0f, 41.37258f, 128.0f, 48.0f),
                    PathNode.CurveTo(128.0f, 54.62742f, 133.37259f, 60.0f, 140.0f, 60.0f),
                    PathNode.CurveTo(170.8291f, 59.893303f, 196.68327f, 83.248665f, 199.7f, 113.93f),
                    PathNode.CurveTo(200.23059f, 119.202805f, 204.15707f, 123.50324f, 209.36f, 124.51f),
                    PathNode.CurveTo(223.53375f, 127.25277f, 233.2987f, 140.32233f, 231.91066f, 154.69212f),
                    PathNode.CurveTo(230.52263f, 169.06194f, 218.43668f, 180.02083f, 204.0f, 180.0f),
                    PathNode.LineTo(140.0f, 180.0f),
                    PathNode.CurveTo(133.37259f, 180.0f, 128.0f, 185.37259f, 128.0f, 192.0f),
                    PathNode.CurveTo(128.0f, 198.62741f, 133.37259f, 204.0f, 140.0f, 204.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.CurveTo(229.1356f, 204.01485f, 250.68364f, 186.04852f, 255.18869f, 161.31995f),
                    PathNode.CurveTo(259.69373f, 136.59135f, 245.86597f, 112.18029f, 222.34f, 103.33f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null
