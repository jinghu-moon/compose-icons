package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorLightIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.24f, 91.76f),
                    PathNode.LineTo(212.24f, 51.76f),
                    PathNode.CurveTo(209.89746f, 49.420372f, 206.10254f, 49.420372f, 203.76f, 51.76f),
                    PathNode.LineTo(168.0f, 87.52f),
                    PathNode.LineTo(132.24f, 51.76f),
                    PathNode.CurveTo(129.89746f, 49.420372f, 126.10254f, 49.420372f, 123.76f, 51.76f),
                    PathNode.LineTo(88.0f, 87.52f),
                    PathNode.LineTo(52.24f, 51.76f),
                    PathNode.CurveTo(49.89746f, 49.420372f, 46.10254f, 49.420372f, 43.76f, 51.76f),
                    PathNode.LineTo(3.76f, 91.76f),
                    PathNode.CurveTo(1.420373f, 94.10254f, 1.420373f, 97.89746f, 3.76f, 100.24f),
                    PathNode.LineTo(43.76f, 140.24f),
                    PathNode.CurveTo(46.10254f, 142.57962f, 49.89746f, 142.57962f, 52.24f, 140.24f),
                    PathNode.LineTo(88.0f, 104.48f),
                    PathNode.LineTo(119.52f, 136.0f),
                    PathNode.LineTo(83.76f, 171.76f),
                    PathNode.CurveTo(81.42038f, 174.10254f, 81.42038f, 177.89746f, 83.76f, 180.24f),
                    PathNode.LineTo(123.76f, 220.24f),
                    PathNode.CurveTo(126.10254f, 222.57962f, 129.89746f, 222.57962f, 132.24f, 220.24f),
                    PathNode.LineTo(172.24f, 180.24f),
                    PathNode.CurveTo(174.57962f, 177.89746f, 174.57962f, 174.10254f, 172.24f, 171.76f),
                    PathNode.LineTo(136.48f, 136.0f),
                    PathNode.LineTo(168.0f, 104.48f),
                    PathNode.LineTo(203.76f, 140.24f),
                    PathNode.CurveTo(206.10254f, 142.57962f, 209.89746f, 142.57962f, 212.24f, 140.24f),
                    PathNode.LineTo(252.24f, 100.24f),
                    PathNode.CurveTo(254.57962f, 97.89746f, 254.57962f, 94.10254f, 252.24f, 91.76f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 127.51f),
                    PathNode.LineTo(16.49f, 96.0f),
                    PathNode.LineTo(48.0f, 64.49f),
                    PathNode.LineTo(79.51f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 207.51f),
                    PathNode.LineTo(96.49f, 176.0f),
                    PathNode.LineTo(128.0f, 144.49f),
                    PathNode.LineTo(159.51f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 127.51f),
                    PathNode.LineTo(96.49f, 96.0f),
                    PathNode.LineTo(128.0f, 64.49f),
                    PathNode.LineTo(159.51f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 127.51f),
                    PathNode.LineTo(176.49f, 96.0f),
                    PathNode.LineTo(208.0f, 64.49f),
                    PathNode.LineTo(239.51f, 96.0f),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
