package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorLightIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.07f, 52.8f),
                    PathNode.CurveTo(235.97218f, 51.058777f, 234.05841f, 50.001865f, 232.0f, 50.0f),
                    PathNode.LineTo(40.0f, 50.0f),
                    PathNode.CurveTo(37.574867f, 50.002132f, 35.389473f, 51.46396f, 34.461704f, 53.704613f),
                    PathNode.CurveTo(33.533936f, 55.945263f, 34.046234f, 58.524105f, 35.76f, 60.24f),
                    PathNode.LineTo(79.51f, 104.0f),
                    PathNode.LineTo(35.76f, 147.76f),
                    PathNode.CurveTo(34.046234f, 149.47589f, 33.533936f, 152.05473f, 34.461704f, 154.2954f),
                    PathNode.CurveTo(35.389473f, 156.53604f, 37.574867f, 157.99785f, 40.0f, 158.0f),
                    PathNode.LineTo(176.78f, 158.0f),
                    PathNode.LineTo(146.58f, 221.42f),
                    PathNode.CurveTo(145.1551f, 224.41338f, 146.42662f, 227.9951f, 149.42f, 229.42f),
                    PathNode.CurveTo(152.41338f, 230.8449f, 155.9951f, 229.57338f, 157.42f, 226.58f),
                    PathNode.LineTo(237.42f, 58.58f),
                    PathNode.CurveTo(238.30229f, 56.720802f, 238.17018f, 54.53915f, 237.07f, 52.8f),
                    PathNode.Close,
                    PathNode.MoveTo(182.5f, 146.0f),
                    PathNode.LineTo(54.5f, 146.0f),
                    PathNode.LineTo(92.25f, 108.24f),
                    PathNode.CurveTo(94.58963f, 105.89746f, 94.58963f, 102.10254f, 92.25f, 99.76f),
                    PathNode.LineTo(54.49f, 62.0f),
                    PathNode.LineTo(222.49f, 62.0f),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
