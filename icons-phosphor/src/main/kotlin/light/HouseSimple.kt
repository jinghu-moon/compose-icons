package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) return _houseSimple!!
        _houseSimple = phosphorLightIcon(
            name = "HouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(217.9f, 110.1f),
                    PathNode.LineTo(137.9f, 30.1f),
                    PathNode.CurveTo(135.27444f, 27.474182f, 131.71327f, 25.99899f, 128.0f, 25.99899f),
                    PathNode.CurveTo(124.28672f, 25.99899f, 120.72555f, 27.474182f, 118.1f, 30.1f),
                    PathNode.LineTo(38.1f, 110.1f),
                    PathNode.CurveTo(35.467056f, 112.7207f, 33.990883f, 116.28511f, 34.0f, 120.0f),
                    PathNode.LineTo(34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 219.3137f, 36.68629f, 222.0f, 40.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.LineTo(222.0f, 120.0f),
                    PathNode.CurveTo(222.00911f, 116.28511f, 220.53294f, 112.7207f, 217.9f, 110.1f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 210.0f),
                    PathNode.LineTo(46.0f, 210.0f),
                    PathNode.LineTo(46.0f, 120.0f),
                    PathNode.CurveTo(45.996925f, 119.46839f, 46.205627f, 118.957436f, 46.58f, 118.58f),
                    PathNode.LineTo(126.58f, 38.58f),
                    PathNode.CurveTo(126.955536f, 38.201378f, 127.46673f, 37.988403f, 128.0f, 37.988403f),
                    PathNode.CurveTo(128.53328f, 37.988403f, 129.04446f, 38.201378f, 129.42f, 38.58f),
                    PathNode.LineTo(209.42f, 118.58f),
                    PathNode.CurveTo(209.79437f, 118.957436f, 210.00307f, 119.46839f, 210.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
