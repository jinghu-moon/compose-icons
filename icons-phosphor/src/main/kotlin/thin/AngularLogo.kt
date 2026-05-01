package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorThinIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.54f, 68.31f),
                    PathNode.LineTo(129.54f, 28.31f),
                    PathNode.CurveTo(128.55449f, 27.898888f, 127.44551f, 27.898888f, 126.46f, 28.31f),
                    PathNode.LineTo(30.46f, 68.31f),
                    PathNode.CurveTo(28.776598f, 68.994545f, 27.766191f, 70.727844f, 28.0f, 72.53f),
                    PathNode.LineTo(44.0f, 192.53f),
                    PathNode.CurveTo(44.173664f, 193.84328f, 44.986248f, 194.98538f, 46.17f, 195.58f),
                    PathNode.LineTo(126.17f, 235.58f),
                    PathNode.CurveTo(127.29674f, 236.14381f, 128.62326f, 236.14381f, 129.75f, 235.58f),
                    PathNode.LineTo(209.75f, 195.58f),
                    PathNode.CurveTo(210.93375f, 194.98538f, 211.74634f, 193.84328f, 211.92f, 192.53f),
                    PathNode.LineTo(227.92f, 72.53f),
                    PathNode.CurveTo(228.16568f, 70.74822f, 227.19188f, 69.02159f, 225.54f, 68.31f),
                    PathNode.Close,
                    PathNode.MoveTo(204.32f, 189.37f),
                    PathNode.LineTo(128.0f, 227.53f),
                    PathNode.LineTo(51.68f, 189.37f),
                    PathNode.LineTo(36.37f, 74.51f),
                    PathNode.LineTo(128.0f, 36.33f),
                    PathNode.LineTo(219.63f, 74.51f),
                    PathNode.Close,
                    PathNode.MoveTo(124.5f, 86.06f),
                    PathNode.LineTo(84.5f, 158.06f),
                    PathNode.CurveTo(83.428566f, 159.993f, 84.12701f, 162.42857f, 86.06f, 163.5f),
                    PathNode.CurveTo(87.993f, 164.57143f, 90.428566f, 163.873f, 91.5f, 161.94f),
                    PathNode.LineTo(103.69f, 140.0f),
                    PathNode.LineTo(152.31f, 140.0f),
                    PathNode.LineTo(164.5f, 161.94f),
                    PathNode.CurveTo(165.57143f, 163.873f, 168.007f, 164.57143f, 169.94f, 163.5f),
                    PathNode.CurveTo(171.873f, 162.42857f, 172.57143f, 159.993f, 171.5f, 158.06f),
                    PathNode.LineTo(131.5f, 86.06f),
                    PathNode.CurveTo(130.79553f, 84.786736f, 129.45515f, 83.99649f, 128.0f, 83.99649f),
                    PathNode.CurveTo(126.544846f, 83.99649f, 125.204475f, 84.786736f, 124.5f, 86.06f),
                    PathNode.Close,
                    PathNode.MoveTo(147.87f, 132.0f),
                    PathNode.LineTo(108.13f, 132.0f),
                    PathNode.LineTo(128.0f, 96.24f),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
