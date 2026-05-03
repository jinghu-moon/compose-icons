package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) return _numberSquareNine!!
        _numberSquareNine = phosphorThinIcon(
            name = "NumberSquareNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 80.29f),
                    PathNode.CurveTo(131.29112f, 72.93559f, 115.207886f, 75.17414f, 104.9904f, 85.71955f),
                    PathNode.CurveTo(94.77291f, 96.26496f, 93.04339f, 112.41088f, 100.79547f, 124.88116f),
                    PathNode.CurveTo(108.54756f, 137.35144f, 123.79176f, 142.94572f, 137.77f, 138.45f),
                    PathNode.LineTo(116.57f, 174.0f),
                    PathNode.CurveTo(115.44022f, 175.89468f, 116.05762f, 178.34636f, 117.95f, 179.48f),
                    PathNode.CurveTo(118.55319f, 179.8466f, 119.24417f, 180.04353f, 119.95f, 180.05f),
                    PathNode.CurveTo(121.356674f, 180.04832f, 122.65908f, 179.30789f, 123.38f, 178.1f),
                    PathNode.LineTo(155.71f, 124.0f),
                    PathNode.CurveTo(164.5451f, 108.696f, 159.30266f, 89.12744f, 144.0f, 80.29f),
                    PathNode.Close,
                    PathNode.MoveTo(148.8f, 120.0f),
                    PathNode.LineTo(148.74f, 120.09f),
                    PathNode.CurveTo(141.79135f, 130.45917f, 127.75674f, 133.23993f, 117.379265f, 126.30368f),
                    PathNode.CurveTo(107.0018f, 119.36743f, 104.20426f, 105.33615f, 111.1281f, 94.9504f),
                    PathNode.CurveTo(118.05193f, 84.56464f, 132.07986f, 81.750336f, 142.47389f, 88.66175f),
                    PathNode.CurveTo(152.8679f, 95.573166f, 155.69899f, 109.597725f, 148.8f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
