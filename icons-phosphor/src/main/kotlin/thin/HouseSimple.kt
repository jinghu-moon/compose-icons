package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) return _houseSimple!!
        _houseSimple = phosphorThinIcon(
            name = "HouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 111.51f),
                    PathNode.LineTo(136.49f, 31.51f),
                    PathNode.CurveTo(134.23837f, 29.250546f, 131.17982f, 27.980537f, 127.99f, 27.980537f),
                    PathNode.CurveTo(124.80018f, 27.980537f, 121.74162f, 29.250546f, 119.49f, 31.51f),
                    PathNode.LineTo(39.49f, 111.51f),
                    PathNode.CurveTo(37.247467f, 113.76563f, 35.992188f, 116.81931f, 36.0f, 120.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 218.20914f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 120.0f),
                    PathNode.CurveTo(220.0025f, 116.816444f, 218.73987f, 113.76237f, 216.49f, 111.51f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 212.0f),
                    PathNode.LineTo(44.0f, 212.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.CurveTo(43.999165f, 118.93881f, 44.420044f, 117.92079f, 45.17f, 117.17f),
                    PathNode.LineTo(125.17f, 37.17f),
                    PathNode.CurveTo(125.92027f, 36.41889f, 126.93836f, 35.996853f, 128.0f, 35.996853f),
                    PathNode.CurveTo(129.06163f, 35.996853f, 130.07973f, 36.41889f, 130.83f, 37.17f),
                    PathNode.LineTo(210.83f, 117.17f),
                    PathNode.CurveTo(211.57996f, 117.92079f, 212.00084f, 118.93881f, 212.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
