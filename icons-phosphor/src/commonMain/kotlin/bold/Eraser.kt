package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorBoldIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 204.0f),
                    PathNode.LineTo(141.0f, 204.0f),
                    PathNode.LineTo(227.84f, 117.16f),
                    PathNode.CurveTo(233.09163f, 111.9089f, 236.04202f, 104.78656f, 236.04202f, 97.36f),
                    PathNode.CurveTo(236.04202f, 89.93344f, 233.09163f, 82.811104f, 227.84f, 77.56f),
                    PathNode.LineTo(186.43f, 36.19f),
                    PathNode.CurveTo(181.1789f, 30.938364f, 174.05656f, 27.98798f, 166.63f, 27.98798f),
                    PathNode.CurveTo(159.20345f, 27.98798f, 152.0811f, 30.938364f, 146.83f, 36.19f),
                    PathNode.LineTo(28.19f, 154.82f),
                    PathNode.CurveTo(22.938364f, 160.0711f, 19.98798f, 167.19344f, 19.98798f, 174.62f),
                    PathNode.CurveTo(19.98798f, 182.04655f, 22.938364f, 189.1689f, 28.19f, 194.42f),
                    PathNode.LineTo(58.25f, 224.49f),
                    PathNode.CurveTo(60.502365f, 226.73987f, 63.55645f, 228.0025f, 66.74f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 209.37259f, 222.62741f, 204.0f, 216.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.8f, 53.16f),
                    PathNode.CurveTo(164.55028f, 52.408894f, 165.56836f, 51.986855f, 166.63f, 51.986855f),
                    PathNode.CurveTo(167.69164f, 51.986855f, 168.70973f, 52.408894f, 169.46f, 53.16f),
                    PathNode.LineTo(210.84f, 94.54f),
                    PathNode.CurveTo(212.39754f, 96.10131f, 212.39754f, 98.62869f, 210.84f, 100.19f),
                    PathNode.LineTo(160.0f, 151.0f),
                    PathNode.LineTo(113.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(71.71f, 204.0f),
                    PathNode.LineTo(45.16f, 177.45f),
                    PathNode.CurveTo(43.602467f, 175.88869f, 43.602467f, 173.36131f, 45.16f, 171.8f),
                    PathNode.LineTo(96.0f, 121.0f),
                    PathNode.LineTo(143.0f, 168.0f),
                    PathNode.LineTo(107.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eraser!!
    }

private var _eraser: ImageVector? = null
