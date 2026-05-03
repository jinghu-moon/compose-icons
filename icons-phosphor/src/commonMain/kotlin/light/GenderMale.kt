package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorLightIcon(
            name = "GenderMale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 34.0f),
                    PathNode.LineTo(168.0f, 34.0f),
                    PathNode.CurveTo(164.6863f, 34.0f, 162.0f, 36.68629f, 162.0f, 40.0f),
                    PathNode.CurveTo(162.0f, 43.31371f, 164.6863f, 46.0f, 168.0f, 46.0f),
                    PathNode.LineTo(201.52f, 46.0f),
                    PathNode.LineTo(154.72f, 92.79f),
                    PathNode.CurveTo(122.59368f, 65.279015f, 74.39479f, 68.38554f, 46.065887f, 99.79299f),
                    PathNode.CurveTo(17.736986f, 131.20044f, 19.601688f, 179.46333f, 50.269463f, 208.59137f),
                    PathNode.CurveTo(80.93723f, 237.7194f, 129.23213f, 237.09776f, 159.14f, 207.19f),
                    PathNode.LineTo(159.14f, 207.19f),
                    PathNode.CurveTo(187.90486f, 178.34845f, 189.6766f, 132.24403f, 163.21f, 101.28f),
                    PathNode.LineTo(210.0f, 54.49f),
                    PathNode.LineTo(210.0f, 88.0f),
                    PathNode.CurveTo(210.0f, 91.313705f, 212.6863f, 94.0f, 216.0f, 94.0f),
                    PathNode.CurveTo(219.3137f, 94.0f, 222.0f, 91.313705f, 222.0f, 88.0f),
                    PathNode.LineTo(222.0f, 40.0f),
                    PathNode.CurveTo(222.0f, 36.68629f, 219.3137f, 34.0f, 216.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.66f, 198.7f),
                    PathNode.CurveTo(124.8822f, 224.4657f, 83.098946f, 224.45917f, 57.32921f, 198.6854f),
                    PathNode.CurveTo(31.559475f, 172.91162f, 31.559475f, 131.12837f, 57.32921f, 105.35461f),
                    PathNode.CurveTo(83.098946f, 79.58083f, 124.8822f, 79.574295f, 150.66f, 105.34f),
                    PathNode.CurveTo(176.39407f, 131.13992f, 176.39407f, 172.90007f, 150.66f, 198.7f),
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
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
