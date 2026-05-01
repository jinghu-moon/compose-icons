package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorThinIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.52f, 118.0f),
                    PathNode.LineTo(158.33f, 61.87f),
                    PathNode.CurveTo(154.64299f, 59.534782f, 149.97884f, 59.385437f, 146.15f, 61.48f),
                    PathNode.CurveTo(142.33649f, 63.52467f, 139.96889f, 67.51304f, 140.0f, 71.84f),
                    PathNode.LineTo(140.0f, 116.43f),
                    PathNode.LineTo(54.33f, 61.87f),
                    PathNode.CurveTo(50.642998f, 59.534782f, 45.978844f, 59.385437f, 42.15f, 61.48f),
                    PathNode.CurveTo(38.336487f, 63.52467f, 35.968876f, 67.51304f, 36.0f, 71.84f),
                    PathNode.LineTo(36.0f, 184.16f),
                    PathNode.CurveTo(35.968876f, 188.48695f, 38.336487f, 192.47533f, 42.15f, 194.52f),
                    PathNode.CurveTo(45.978844f, 196.61456f, 50.642998f, 196.46521f, 54.33f, 194.13f),
                    PathNode.LineTo(140.0f, 139.57f),
                    PathNode.LineTo(140.0f, 184.16f),
                    PathNode.CurveTo(139.96889f, 188.48695f, 142.33649f, 192.47533f, 146.15f, 194.52f),
                    PathNode.CurveTo(149.97884f, 196.61456f, 154.64299f, 196.46521f, 158.33f, 194.13f),
                    PathNode.LineTo(246.52f, 138.0f),
                    PathNode.CurveTo(249.9323f, 135.83334f, 251.9995f, 132.07205f, 251.9995f, 128.03f),
                    PathNode.CurveTo(251.9995f, 123.987946f, 249.9323f, 120.226654f, 246.52f, 118.06f),
                    PathNode.Close,
                    PathNode.MoveTo(138.22f, 131.19f),
                    PathNode.LineTo(50.0f, 187.38f),
                    PathNode.CurveTo(48.791565f, 188.15413f, 47.256153f, 188.20403f, 46.0f, 187.51f),
                    PathNode.CurveTo(44.760803f, 186.85365f, 43.98982f, 185.56226f, 44.0f, 184.16f),
                    PathNode.LineTo(44.0f, 71.84f),
                    PathNode.CurveTo(43.98982f, 70.43775f, 44.760803f, 69.146355f, 46.0f, 68.49f),
                    PathNode.CurveTo(46.584885f, 68.16636f, 47.241554f, 67.99445f, 47.91f, 67.99f),
                    PathNode.CurveTo(48.665726f, 67.99138f, 49.405113f, 68.21007f, 50.04f, 68.62f),
                    PathNode.LineTo(138.22f, 124.78f),
                    PathNode.CurveTo(139.32886f, 125.47487f, 140.00218f, 126.6914f, 140.00218f, 128.0f),
                    PathNode.CurveTo(140.00218f, 129.3086f, 139.32886f, 130.52513f, 138.22f, 131.22f),
                    PathNode.Close,
                    PathNode.MoveTo(242.22f, 131.19f),
                    PathNode.LineTo(154.0f, 187.38f),
                    PathNode.CurveTo(152.79156f, 188.15413f, 151.25615f, 188.20403f, 150.0f, 187.51f),
                    PathNode.CurveTo(148.7608f, 186.85365f, 147.98982f, 185.56226f, 148.0f, 184.16f),
                    PathNode.LineTo(148.0f, 71.84f),
                    PathNode.CurveTo(147.98982f, 70.43775f, 148.7608f, 69.146355f, 150.0f, 68.49f),
                    PathNode.CurveTo(150.58488f, 68.16636f, 151.24156f, 67.99445f, 151.91f, 67.99f),
                    PathNode.CurveTo(152.66573f, 67.99138f, 153.4051f, 68.21007f, 154.04f, 68.62f),
                    PathNode.LineTo(242.22f, 124.78f),
                    PathNode.CurveTo(243.32886f, 125.47487f, 244.00218f, 126.6914f, 244.00218f, 128.0f),
                    PathNode.CurveTo(244.00218f, 129.3086f, 243.32886f, 130.52513f, 242.22f, 131.22f),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
