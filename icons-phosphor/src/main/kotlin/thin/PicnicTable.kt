package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorThinIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 132.0f),
                    PathNode.LineTo(198.47f, 132.0f),
                    PathNode.LineTo(166.47f, 68.0f),
                    PathNode.LineTo(192.0f, 68.0f),
                    PathNode.CurveTo(194.20914f, 68.0f, 196.0f, 66.20914f, 196.0f, 64.0f),
                    PathNode.CurveTo(196.0f, 61.79086f, 194.20914f, 60.0f, 192.0f, 60.0f),
                    PathNode.LineTo(64.0f, 60.0f),
                    PathNode.CurveTo(61.79086f, 60.0f, 60.0f, 61.79086f, 60.0f, 64.0f),
                    PathNode.CurveTo(60.0f, 66.20914f, 61.79086f, 68.0f, 64.0f, 68.0f),
                    PathNode.LineTo(89.53f, 68.0f),
                    PathNode.LineTo(57.53f, 132.0f),
                    PathNode.LineTo(8.0f, 132.0f),
                    PathNode.CurveTo(5.790861f, 132.0f, 4.0f, 133.79086f, 4.0f, 136.0f),
                    PathNode.CurveTo(4.0f, 138.20914f, 5.790861f, 140.0f, 8.0f, 140.0f),
                    PathNode.LineTo(53.53f, 140.0f),
                    PathNode.LineTo(28.42f, 190.21f),
                    PathNode.CurveTo(27.944563f, 191.15936f, 27.866074f, 192.25879f, 28.201828f, 193.26605f),
                    PathNode.CurveTo(28.537584f, 194.27333f, 29.260035f, 195.10577f, 30.21f, 195.58f),
                    PathNode.CurveTo(30.767412f, 195.85304f, 31.379314f, 195.99663f, 32.0f, 196.0f),
                    PathNode.CurveTo(33.51566f, 196.00108f, 34.901745f, 195.14543f, 35.58f, 193.79f),
                    PathNode.LineTo(62.47f, 140.0f),
                    PathNode.LineTo(193.53f, 140.0f),
                    PathNode.LineTo(220.42f, 193.79f),
                    PathNode.CurveTo(221.09825f, 195.14543f, 222.48434f, 196.00108f, 224.0f, 196.0f),
                    PathNode.CurveTo(224.62068f, 195.99663f, 225.23259f, 195.85304f, 225.79f, 195.58f),
                    PathNode.CurveTo(226.73994f, 195.10577f, 227.46242f, 194.27333f, 227.79817f, 193.26605f),
                    PathNode.CurveTo(228.13393f, 192.25879f, 228.05544f, 191.15936f, 227.58f, 190.21f),
                    PathNode.LineTo(202.47f, 140.0f),
                    PathNode.LineTo(248.0f, 140.0f),
                    PathNode.CurveTo(250.20914f, 140.0f, 252.0f, 138.20914f, 252.0f, 136.0f),
                    PathNode.CurveTo(252.0f, 133.79086f, 250.20914f, 132.0f, 248.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.47f, 132.0f),
                    PathNode.LineTo(98.47f, 68.0f),
                    PathNode.LineTo(157.53f, 68.0f),
                    PathNode.LineTo(189.53f, 132.0f),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
