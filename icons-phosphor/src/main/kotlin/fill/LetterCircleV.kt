package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LetterCircleV: ImageVector
    get() {
        if (_letterCircleV != null) return _letterCircleV!!
        _letterCircleV = phosphorFillIcon(
            name = "LetterCircleV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(167.43f, 99.0f),
                    PathNode.LineTo(135.43f, 179.0f),
                    PathNode.CurveTo(134.21654f, 182.04016f, 131.27339f, 184.03435f, 128.0f, 184.03435f),
                    PathNode.CurveTo(124.726616f, 184.03435f, 121.78346f, 182.04016f, 120.57f, 179.0f),
                    PathNode.LineTo(88.57f, 99.0f),
                    PathNode.CurveTo(86.91315f, 94.89652f, 88.89652f, 90.22685f, 93.0f, 88.57f),
                    PathNode.CurveTo(97.10348f, 86.91315f, 101.77315f, 88.89652f, 103.43f, 93.0f),
                    PathNode.LineTo(128.0f, 154.46f),
                    PathNode.LineTo(152.57f, 93.0f),
                    PathNode.CurveTo(154.22685f, 88.89652f, 158.89653f, 86.91315f, 163.0f, 88.57f),
                    PathNode.CurveTo(167.10347f, 90.22685f, 169.08685f, 94.89652f, 167.43f, 99.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _letterCircleV!!
    }

private var _letterCircleV: ImageVector? = null
