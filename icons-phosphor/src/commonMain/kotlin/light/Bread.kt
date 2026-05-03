package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorLightIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 80.0f),
                    PathNode.CurveTo(238.0f, 59.01318f, 220.98682f, 42.0f, 200.0f, 42.0f),
                    PathNode.LineTo(48.0f, 42.0f),
                    PathNode.CurveTo(29.768097f, 42.008514f, 14.111587f, 54.96453f, 10.692096f, 72.872894f),
                    PathNode.CurveTo(7.272606f, 90.78126f, 17.053923f, 108.59447f, 34.0f, 115.32f),
                    PathNode.LineTo(34.0f, 200.0f),
                    PathNode.CurveTo(34.0f, 207.73198f, 40.268013f, 214.0f, 48.0f, 214.0f),
                    PathNode.LineTo(200.0f, 214.0f),
                    PathNode.CurveTo(207.73198f, 214.0f, 214.0f, 207.73198f, 214.0f, 200.0f),
                    PathNode.LineTo(214.0f, 115.32f),
                    PathNode.CurveTo(228.47147f, 109.56409f, 237.97768f, 95.57412f, 238.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 200.0f),
                    PathNode.LineTo(46.0f, 118.0f),
                    PathNode.CurveTo(46.66f, 118.0f, 47.33f, 118.0f, 48.0f, 118.0f),
                    PathNode.CurveTo(51.31371f, 118.0f, 54.0f, 115.313705f, 54.0f, 112.0f),
                    PathNode.CurveTo(54.0f, 108.686295f, 51.31371f, 106.0f, 48.0f, 106.0f),
                    PathNode.CurveTo(33.6406f, 106.0f, 22.0f, 94.359406f, 22.0f, 80.0f),
                    PathNode.CurveTo(22.0f, 65.640594f, 33.6406f, 54.0f, 48.0f, 54.0f),
                    PathNode.LineTo(144.0f, 54.0f),
                    PathNode.CurveTo(158.3594f, 54.0f, 170.0f, 65.640594f, 170.0f, 80.0f),
                    PathNode.CurveTo(170.0f, 94.359406f, 158.3594f, 106.0f, 144.0f, 106.0f),
                    PathNode.CurveTo(140.6863f, 106.0f, 138.0f, 108.686295f, 138.0f, 112.0f),
                    PathNode.CurveTo(138.0f, 115.313705f, 140.6863f, 118.0f, 144.0f, 118.0f),
                    PathNode.CurveTo(144.67f, 118.0f, 145.34f, 118.0f, 146.0f, 118.0f),
                    PathNode.LineTo(146.0f, 200.0f),
                    PathNode.CurveTo(146.0f, 201.10457f, 145.10457f, 202.0f, 144.0f, 202.0f),
                    PathNode.LineTo(48.0f, 202.0f),
                    PathNode.CurveTo(46.89543f, 202.0f, 46.0f, 201.10457f, 46.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 106.0f),
                    PathNode.CurveTo(196.6863f, 106.0f, 194.0f, 108.686295f, 194.0f, 112.0f),
                    PathNode.CurveTo(194.0f, 115.313705f, 196.6863f, 118.0f, 200.0f, 118.0f),
                    PathNode.CurveTo(200.67f, 118.0f, 201.34f, 118.0f, 202.0f, 118.0f),
                    PathNode.LineTo(202.0f, 200.0f),
                    PathNode.CurveTo(202.0f, 201.10457f, 201.10457f, 202.0f, 200.0f, 202.0f),
                    PathNode.LineTo(157.84f, 202.0f),
                    PathNode.CurveTo(157.9388f, 201.33775f, 157.99225f, 200.66953f, 158.0f, 200.0f),
                    PathNode.LineTo(158.0f, 115.32f),
                    PathNode.CurveTo(169.68762f, 110.67723f, 178.32124f, 100.55272f, 181.05954f, 88.27845f),
                    PathNode.CurveTo(183.79782f, 76.00418f, 180.28606f, 63.170135f, 171.68f, 54.0f),
                    PathNode.LineTo(200.0f, 54.0f),
                    PathNode.CurveTo(214.3594f, 54.0f, 226.0f, 65.640594f, 226.0f, 80.0f),
                    PathNode.CurveTo(226.0f, 94.359406f, 214.3594f, 106.0f, 200.0f, 106.0f),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
