package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorLightIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(242.0f, 98.33f),
                    PathNode.LineTo(58.0f, 34.33f),
                    PathNode.CurveTo(56.1614f, 33.67995f, 54.121567f, 33.964012f, 52.530525f, 35.091663f),
                    PathNode.CurveTo(50.93948f, 36.21932f, 49.995728f, 38.04987f, 50.0f, 40.0f),
                    PathNode.LineTo(50.0f, 216.0f),
                    PathNode.CurveTo(50.0f, 219.3137f, 52.68629f, 222.0f, 56.0f, 222.0f),
                    PathNode.CurveTo(59.31371f, 222.0f, 62.0f, 219.3137f, 62.0f, 216.0f),
                    PathNode.LineTo(62.0f, 172.27f),
                    PathNode.LineTo(242.0f, 109.67f),
                    PathNode.CurveTo(244.41667f, 108.83359f, 246.03758f, 106.55732f, 246.03758f, 104.0f),
                    PathNode.CurveTo(246.03758f, 101.44268f, 244.41667f, 99.16641f, 242.0f, 98.33f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 159.56f),
                    PathNode.LineTo(62.0f, 48.44f),
                    PathNode.LineTo(221.74f, 104.0f),
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
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
