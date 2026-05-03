package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorLightIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.24f, 67.76f),
                    PathNode.LineTo(188.24f, 19.76f),
                    PathNode.CurveTo(185.87592f, 17.557129f, 182.19193f, 17.62213f, 179.90703f, 19.907026f),
                    PathNode.CurveTo(177.62213f, 22.191923f, 177.55713f, 25.875921f, 179.76f, 28.24f),
                    PathNode.LineTo(199.51f, 48.0f),
                    PathNode.LineTo(168.0f, 79.51f),
                    PathNode.LineTo(132.24f, 43.76f),
                    PathNode.CurveTo(130.74423f, 42.154774f, 128.49156f, 41.494007f, 126.3657f, 42.036915f),
                    PathNode.CurveTo(124.23982f, 42.579826f, 122.57983f, 44.239822f, 122.03692f, 46.36569f),
                    PathNode.CurveTo(121.494f, 48.491554f, 122.15478f, 50.744236f, 123.76f, 52.24f),
                    PathNode.LineTo(131.51f, 60.0f),
                    PathNode.LineTo(46.1f, 145.41f),
                    PathNode.CurveTo(43.468937f, 148.03197f, 41.993107f, 151.59555f, 42.0f, 155.31f),
                    PathNode.LineTo(42.0f, 205.51f),
                    PathNode.LineTo(19.76f, 227.76f),
                    PathNode.CurveTo(18.154774f, 229.25575f, 17.494007f, 231.50844f, 18.036915f, 233.63431f),
                    PathNode.CurveTo(18.579824f, 235.76018f, 20.239822f, 237.42018f, 22.365688f, 237.96309f),
                    PathNode.CurveTo(24.491556f, 238.506f, 26.744236f, 237.84523f, 28.24f, 236.24f),
                    PathNode.LineTo(50.49f, 214.0f),
                    PathNode.LineTo(100.69f, 214.0f),
                    PathNode.CurveTo(104.40445f, 214.0069f, 107.96804f, 212.53107f, 110.59f, 209.9f),
                    PathNode.LineTo(196.0f, 124.49f),
                    PathNode.LineTo(203.76f, 132.24f),
                    PathNode.CurveTo(206.12408f, 134.44287f, 209.80807f, 134.37787f, 212.09297f, 132.09297f),
                    PathNode.CurveTo(214.37787f, 129.80807f, 214.44287f, 126.12408f, 212.24f, 123.76f),
                    PathNode.LineTo(176.49f, 88.0f),
                    PathNode.LineTo(208.0f, 56.49f),
                    PathNode.LineTo(227.76f, 76.24f),
                    PathNode.CurveTo(230.12408f, 78.44287f, 233.80807f, 78.37787f, 236.09297f, 76.09297f),
                    PathNode.CurveTo(238.37787f, 73.808075f, 238.44287f, 70.12408f, 236.24f, 67.76f),
                    PathNode.Close,
                    PathNode.MoveTo(102.1f, 201.41f),
                    PathNode.CurveTo(101.72665f, 201.78558f, 101.219574f, 201.99777f, 100.69f, 202.0f),
                    PathNode.LineTo(54.0f, 202.0f),
                    PathNode.LineTo(54.0f, 155.31f),
                    PathNode.CurveTo(54.00223f, 154.78043f, 54.214413f, 154.27335f, 54.59f, 153.9f),
                    PathNode.LineTo(74.0f, 134.49f),
                    PathNode.LineTo(95.76f, 156.24f),
                    PathNode.CurveTo(97.25577f, 157.84523f, 99.508446f, 158.506f, 101.6343f, 157.96309f),
                    PathNode.CurveTo(103.76018f, 157.42018f, 105.42017f, 155.76018f, 105.96308f, 153.63431f),
                    PathNode.CurveTo(106.506f, 151.50844f, 105.84522f, 149.25575f, 104.24f, 147.76f),
                    PathNode.LineTo(82.49f, 126.0f),
                    PathNode.LineTo(98.0f, 110.49f),
                    PathNode.LineTo(119.76f, 132.24f),
                    PathNode.CurveTo(122.12408f, 134.44287f, 125.808075f, 134.37787f, 128.09297f, 132.09297f),
                    PathNode.CurveTo(130.37787f, 129.80807f, 130.44287f, 126.12408f, 128.24f, 123.76f),
                    PathNode.LineTo(106.49f, 102.0f),
                    PathNode.LineTo(140.0f, 68.49f),
                    PathNode.LineTo(187.51f, 116.0f),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
