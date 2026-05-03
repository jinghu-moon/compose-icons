package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorBoldIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.CurveTo(193.37259f, 36.0f, 188.0f, 41.37258f, 188.0f, 48.0f),
                    PathNode.CurveTo(188.0f, 54.62742f, 193.37259f, 60.0f, 200.0f, 60.0f),
                    PathNode.CurveTo(206.62741f, 60.0f, 212.0f, 65.37258f, 212.0f, 72.0f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.LineTo(44.0f, 72.0f),
                    PathNode.CurveTo(44.0f, 65.37258f, 49.37258f, 60.0f, 56.0f, 60.0f),
                    PathNode.CurveTo(62.62742f, 60.0f, 68.0f, 54.62742f, 68.0f, 48.0f),
                    PathNode.CurveTo(68.0f, 41.37258f, 62.62742f, 36.0f, 56.0f, 36.0f),
                    PathNode.CurveTo(36.11775f, 36.0f, 20.0f, 52.11775f, 20.0f, 72.0f),
                    PathNode.LineTo(20.0f, 164.0f),
                    PathNode.CurveTo(20.0f, 190.50967f, 41.490334f, 212.0f, 68.0f, 212.0f),
                    PathNode.CurveTo(94.50967f, 212.0f, 116.0f, 190.50967f, 116.0f, 164.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.LineTo(140.0f, 148.0f),
                    PathNode.LineTo(140.0f, 164.0f),
                    PathNode.CurveTo(140.0f, 190.50967f, 161.49033f, 212.0f, 188.0f, 212.0f),
                    PathNode.CurveTo(214.50967f, 212.0f, 236.0f, 190.50967f, 236.0f, 164.0f),
                    PathNode.LineTo(236.0f, 72.0f),
                    PathNode.CurveTo(236.0f, 52.11775f, 219.88223f, 36.0f, 200.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 188.0f),
                    PathNode.CurveTo(54.745167f, 188.0f, 44.0f, 177.25484f, 44.0f, 164.0f),
                    PathNode.LineTo(44.0f, 155.0f),
                    PathNode.LineTo(75.74f, 186.74f),
                    PathNode.CurveTo(73.24702f, 187.58347f, 70.63179f, 188.0092f, 68.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 164.0f),
                    PathNode.CurveTo(91.99619f, 165.54036f, 91.84889f, 167.07698f, 91.56f, 168.59f),
                    PathNode.LineTo(71.0f, 148.0f),
                    PathNode.LineTo(92.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 188.0f),
                    PathNode.CurveTo(174.74516f, 188.0f, 164.0f, 177.25484f, 164.0f, 164.0f),
                    PathNode.LineTo(164.0f, 155.0f),
                    PathNode.LineTo(195.74f, 186.74f),
                    PathNode.CurveTo(193.24701f, 187.58347f, 190.63179f, 188.0092f, 188.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 164.0f),
                    PathNode.CurveTo(211.9962f, 165.54036f, 211.84889f, 167.07698f, 211.56f, 168.59f),
                    PathNode.LineTo(191.0f, 148.0f),
                    PathNode.LineTo(212.0f, 148.0f),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
