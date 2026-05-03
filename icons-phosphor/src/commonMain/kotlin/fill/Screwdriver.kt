package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorFillIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.23f, 22.75f),
                    PathNode.CurveTo(213.53001f, 3.078264f, 181.61998f, 3.078264f, 161.92f, 22.75f),
                    PathNode.LineTo(108.68f, 76.0f),
                    PathNode.CurveTo(105.67761f, 78.993256f, 103.99315f, 83.06044f, 104.0f, 87.3f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.LineTo(87.17f, 104.0f),
                    PathNode.CurveTo(83.68463f, 104.00865f, 80.29571f, 105.14531f, 77.51f, 107.24f),
                    PathNode.CurveTo(77.2206f, 107.46106f, 76.946625f, 107.701614f, 76.69f, 107.96f),
                    PathNode.LineTo(68.69f, 115.96f),
                    PathNode.CurveTo(65.68863f, 118.960686f, 64.00242f, 123.03091f, 64.00242f, 127.275f),
                    PathNode.CurveTo(64.00242f, 131.5191f, 65.68863f, 135.58931f, 68.69f, 138.59f),
                    PathNode.LineTo(87.39f, 157.3f),
                    PathNode.LineTo(10.39f, 234.35f),
                    PathNode.CurveTo(7.264069f, 237.47594f, 7.264069f, 242.54407f, 10.39f, 245.67f),
                    PathNode.CurveTo(13.515932f, 248.79593f, 18.584068f, 248.79593f, 21.71f, 245.67f),
                    PathNode.LineTo(98.71f, 168.61f),
                    PathNode.LineTo(117.42f, 187.32f),
                    PathNode.CurveTo(123.66754f, 193.56345f, 133.79247f, 193.56345f, 140.04f, 187.32f),
                    PathNode.LineTo(148.04f, 179.32f),
                    PathNode.CurveTo(148.29855f, 179.06f, 148.53911f, 178.78268f, 148.76f, 178.49f),
                    PathNode.CurveTo(150.86737f, 175.71036f, 152.00862f, 172.31818f, 152.01f, 168.83f),
                    PathNode.LineTo(152.01f, 152.0f),
                    PathNode.LineTo(168.7f, 152.0f),
                    PathNode.CurveTo(172.94377f, 152.00824f, 177.01384f, 150.31537f, 180.0f, 147.3f),
                    PathNode.LineTo(233.23f, 94.07f),
                    PathNode.CurveTo(242.68784f, 84.61249f, 248.0012f, 71.78516f, 248.0012f, 58.41f),
                    PathNode.CurveTo(248.0012f, 45.034836f, 242.68784f, 32.207508f, 233.23f, 22.75f),
                    PathNode.Close,
                    PathNode.MoveTo(205.66f, 61.64f),
                    PathNode.LineTo(149.66f, 117.64f),
                    PathNode.CurveTo(146.53683f, 120.76593f, 141.47093f, 120.76817f, 138.345f, 117.645f),
                    PathNode.CurveTo(135.21907f, 114.52183f, 135.21683f, 109.45593f, 138.34f, 106.33f),
                    PathNode.LineTo(194.34f, 50.33f),
                    PathNode.CurveTo(197.46593f, 47.204067f, 202.53407f, 47.204067f, 205.66f, 50.33f),
                    PathNode.CurveTo(208.78593f, 53.455933f, 208.78593f, 58.524067f, 205.66f, 61.65f),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
