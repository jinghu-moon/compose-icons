package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorBoldIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.12f, 46.44f),
                    PathNode.LineTo(38.22f, 128.0f),
                    PathNode.LineTo(90.12f, 209.56f),
                    PathNode.CurveTo(92.566376f, 213.17746f, 92.85444f, 217.83833f, 90.87212f, 221.7295f),
                    PathNode.CurveTo(88.88981f, 225.62067f, 84.950096f, 228.12776f, 80.585594f, 228.27548f),
                    PathNode.CurveTo(76.221085f, 228.4232f, 72.12088f, 226.18823f, 69.88f, 222.44f),
                    PathNode.LineTo(13.88f, 134.44f),
                    PathNode.CurveTo(11.38071f, 130.51039f, 11.38071f, 125.4896f, 13.88f, 121.56f),
                    PathNode.LineTo(69.88f, 33.56f),
                    PathNode.CurveTo(73.51963f, 28.178076f, 80.781494f, 26.670282f, 86.26283f, 30.158405f),
                    PathNode.CurveTo(91.74417f, 33.64653f, 93.453896f, 40.863518f, 90.12f, 46.44f),
                    PathNode.Close,
                    PathNode.MoveTo(242.12f, 121.56f),
                    PathNode.LineTo(186.12f, 33.56f),
                    PathNode.CurveTo(183.87912f, 29.811771f, 179.77892f, 27.576803f, 175.41441f, 27.724524f),
                    PathNode.CurveTo(171.04991f, 27.872246f, 167.1102f, 30.379332f, 165.12788f, 34.270496f),
                    PathNode.CurveTo(163.14557f, 38.161663f, 163.43364f, 42.822544f, 165.88f, 46.44f),
                    PathNode.LineTo(217.78f, 128.0f),
                    PathNode.LineTo(165.88f, 209.56f),
                    PathNode.CurveTo(163.43364f, 213.17746f, 163.14557f, 217.83833f, 165.12788f, 221.7295f),
                    PathNode.CurveTo(167.1102f, 225.62067f, 171.04991f, 228.12776f, 175.41441f, 228.27548f),
                    PathNode.CurveTo(179.77892f, 228.4232f, 183.87912f, 226.18823f, 186.12f, 222.44f),
                    PathNode.LineTo(242.12f, 134.44f),
                    PathNode.CurveTo(244.6193f, 130.51039f, 244.6193f, 125.4896f, 242.12f, 121.56f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
