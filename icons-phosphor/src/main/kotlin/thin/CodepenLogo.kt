package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorThinIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.0f, 92.55f),
                    PathNode.CurveTo(234.0f, 92.55f, 233.95f, 92.55f, 233.91f, 92.48f),
                    PathNode.LineTo(129.91f, 36.48f),
                    PathNode.CurveTo(128.7242f, 35.839924f, 127.29581f, 35.839924f, 126.11f, 36.48f),
                    PathNode.LineTo(22.11f, 92.48f),
                    PathNode.LineTo(22.0f, 92.56f),
                    PathNode.CurveTo(20.769821f, 93.27021f, 20.008574f, 94.57956f, 20.0f, 96.0f),
                    PathNode.LineTo(20.0f, 160.0f),
                    PathNode.CurveTo(20.005026f, 161.42403f, 20.766748f, 162.73799f, 22.0f, 163.45f),
                    PathNode.CurveTo(22.028074f, 163.47571f, 22.058172f, 163.49911f, 22.09f, 163.52f),
                    PathNode.LineTo(126.09f, 219.52f),
                    PathNode.CurveTo(127.2758f, 220.16008f, 128.7042f, 220.16008f, 129.89f, 219.52f),
                    PathNode.LineTo(233.89f, 163.52f),
                    PathNode.CurveTo(233.92104f, 163.5022f, 233.94824f, 163.47841f, 233.97f, 163.45f),
                    PathNode.CurveTo(235.20325f, 162.73799f, 235.96498f, 161.42403f, 235.97f, 160.0f),
                    PathNode.LineTo(235.97f, 96.0f),
                    PathNode.CurveTo(235.9712f, 94.58213f, 235.22171f, 93.26957f, 234.0f, 92.55f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 153.3f),
                    PathNode.LineTo(181.0f, 128.0f),
                    PathNode.LineTo(228.0f, 102.7f),
                    PathNode.Close,
                    PathNode.MoveTo(172.57f, 123.46f),
                    PathNode.LineTo(132.0f, 101.61f),
                    PathNode.LineTo(132.0f, 46.7f),
                    PathNode.LineTo(223.56f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 147.46f),
                    PathNode.LineTo(91.87f, 128.0f),
                    PathNode.LineTo(128.0f, 108.54f),
                    PathNode.LineTo(164.13f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 46.7f),
                    PathNode.LineTo(124.0f, 101.61f),
                    PathNode.LineTo(83.43f, 123.46f),
                    PathNode.LineTo(32.44f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 102.7f),
                    PathNode.LineTo(75.0f, 128.0f),
                    PathNode.LineTo(28.0f, 153.3f),
                    PathNode.Close,
                    PathNode.MoveTo(83.43f, 132.54f),
                    PathNode.LineTo(124.0f, 154.39f),
                    PathNode.LineTo(124.0f, 209.3f),
                    PathNode.LineTo(32.44f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 209.3f),
                    PathNode.LineTo(132.0f, 154.39f),
                    PathNode.LineTo(172.57f, 132.54f),
                    PathNode.LineTo(223.57f, 160.0f),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
