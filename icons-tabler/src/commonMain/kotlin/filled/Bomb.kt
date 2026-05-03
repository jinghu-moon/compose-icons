package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = tablerFilledIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.499f, 3.996f),
                    PathNode.CurveTo(15.082694f, 3.996072f, 15.642434f, 4.228098f, 16.055f, 4.641f),
                    PathNode.LineTo(19.357f, 7.942f),
                    PathNode.CurveTo(19.77011f, 8.354651f, 20.00223f, 8.914599f, 20.00223f, 9.4985f),
                    PathNode.CurveTo(20.00223f, 10.0824f, 19.77011f, 10.64235f, 19.357f, 11.055f),
                    PathNode.LineTo(18.79f, 11.622f),
                    PathNode.LineTo(18.833f, 11.814f),
                    PathNode.CurveTo(19.525711f, 15.244987f, 18.044397f, 18.749813f, 15.101f, 20.644f),
                    PathNode.LineTo(14.871f, 20.788f),
                    PathNode.CurveTo(11.612791f, 22.740467f, 7.454655f, 22.2942f, 4.684969f, 19.694798f),
                    PathNode.CurveTo(1.915284f, 17.095394f, 1.206427f, 12.973893f, 2.948509f, 9.59851f),
                    PathNode.CurveTo(4.690591f, 6.223128f, 8.460698f, 4.413283f, 12.184f, 5.165f),
                    PathNode.LineTo(12.376f, 5.207f),
                    PathNode.LineTo(12.943f, 4.641f),
                    PathNode.CurveTo(13.308247f, 4.275665f, 13.790409f, 4.050514f, 14.305f, 4.005f),
                    PathNode.Close,
                    PathNode.MoveTo(10.0f, 9.0f),
                    PathNode.CurveTo(7.790861f, 9.0f, 6.0f, 10.790861f, 6.0f, 13.0f),
                    PathNode.CurveTo(6.0f, 13.552285f, 6.447716f, 14.0f, 7.0f, 14.0f),
                    PathNode.CurveTo(7.552285f, 14.0f, 8.0f, 13.552285f, 8.0f, 13.0f),
                    PathNode.CurveTo(8.0f, 11.895431f, 8.895431f, 11.0f, 10.0f, 11.0f),
                    PathNode.CurveTo(10.552285f, 11.0f, 11.0f, 10.552285f, 11.0f, 10.0f),
                    PathNode.CurveTo(11.0f, 9.447715f, 10.552285f, 9.0f, 10.0f, 9.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 2.0f),
                    PathNode.CurveTo(21.529093f, 2.000587f, 21.966166f, 2.413211f, 21.997171f, 2.941395f),
                    PathNode.CurveTo(22.02818f, 3.469579f, 21.642391f, 3.930509f, 21.117f, 3.993f),
                    PathNode.LineTo(21.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(20.0f, 4.83f, 19.698f, 5.629f, 19.154f, 6.25f),
                    PathNode.LineTo(19.0f, 6.413f),
                    PathNode.LineTo(17.707f, 7.706f),
                    PathNode.CurveTo(17.333523f, 8.078211f, 16.735212f, 8.096481f, 16.339722f, 7.747751f),
                    PathNode.CurveTo(15.94423f, 7.399022f, 15.887465f, 6.803129f, 16.21f, 6.386f),
                    PathNode.LineTo(16.293f, 6.292f),
                    PathNode.LineTo(17.586f, 5.0f),
                    PathNode.CurveTo(17.818f, 4.768f, 17.961f, 4.463f, 17.993f, 4.14f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(17.999668f, 2.953375f, 18.806322f, 2.083497f, 19.85f, 2.005f),
                    PathNode.LineTo(20.0f, 2.0f),
                    PathNode.LineTo(21.0f, 2.0f),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
