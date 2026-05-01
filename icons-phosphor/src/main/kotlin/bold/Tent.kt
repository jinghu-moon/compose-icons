package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorBoldIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(255.0f, 187.13f),
                    PathNode.LineTo(191.0f, 43.13f),
                    PathNode.CurveTo(189.07005f, 38.783657f, 184.75555f, 35.987076f, 180.0f, 36.0f),
                    PathNode.LineTo(76.0f, 36.0f),
                    PathNode.CurveTo(71.35229f, 36.004772f, 67.125275f, 38.69292f, 65.15f, 42.9f),
                    PathNode.CurveTo(65.10592f, 42.974464f, 65.06586f, 43.051243f, 65.03f, 43.13f),
                    PathNode.LineTo(65.0f, 43.3f),
                    PathNode.LineTo(65.0f, 43.3f),
                    PathNode.LineTo(1.0f, 187.13f),
                    PathNode.CurveTo(-0.650612f, 190.84718f, -0.306036f, 195.14743f, 1.915426f, 198.55435f),
                    PathNode.CurveTo(4.136887f, 201.96126f, 7.932835f, 204.01106f, 12.0f, 204.0f),
                    PathNode.LineTo(244.0f, 204.0f),
                    PathNode.CurveTo(248.06717f, 204.01106f, 251.86311f, 201.96126f, 254.08458f, 198.55435f),
                    PathNode.CurveTo(256.30603f, 195.14743f, 256.6506f, 190.84718f, 255.0f, 187.13f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 104.55f),
                    PathNode.LineTo(64.0f, 180.0f),
                    PathNode.LineTo(30.46f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 180.0f),
                    PathNode.LineTo(88.0f, 104.55f),
                    PathNode.LineTo(121.54f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(147.8f, 180.0f),
                    PathNode.LineTo(94.47f, 60.0f),
                    PathNode.LineTo(172.2f, 60.0f),
                    PathNode.LineTo(225.54f, 180.0f),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
