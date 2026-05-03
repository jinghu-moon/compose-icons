package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) return _codepenLogo!!
        _codepenLogo = phosphorBoldIcon(
            name = "CodepenLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.68f, 85.43f),
                    PathNode.LineTo(133.68f, 29.43f),
                    PathNode.CurveTo(130.12785f, 27.516962f, 125.85214f, 27.516962f, 122.3f, 29.43f),
                    PathNode.LineTo(18.3f, 85.43f),
                    PathNode.CurveTo(14.415886f, 87.52657f, 11.99626f, 91.58617f, 12.0f, 96.0f),
                    PathNode.LineTo(12.0f, 160.0f),
                    PathNode.CurveTo(12.000221f, 164.41812f, 14.428151f, 168.47874f, 18.32f, 170.57f),
                    PathNode.LineTo(122.32f, 226.57f),
                    PathNode.CurveTo(125.87214f, 228.48305f, 130.14786f, 228.48305f, 133.7f, 226.57f),
                    PathNode.LineTo(237.7f, 170.57f),
                    PathNode.CurveTo(241.58412f, 168.47343f, 244.00374f, 164.41383f, 244.0f, 160.0f),
                    PathNode.LineTo(244.0f, 96.0f),
                    PathNode.CurveTo(243.99979f, 91.58188f, 241.57185f, 87.52124f, 237.68f, 85.43f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 139.91f),
                    PathNode.LineTo(197.88f, 128.0f),
                    PathNode.LineTo(220.0f, 116.09f),
                    PathNode.Close,
                    PathNode.MoveTo(172.57f, 114.37f),
                    PathNode.LineTo(140.0f, 96.83f),
                    PathNode.LineTo(140.0f, 60.09f),
                    PathNode.LineTo(206.69f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 138.37f),
                    PathNode.LineTo(108.74f, 128.0f),
                    PathNode.LineTo(128.0f, 117.63f),
                    PathNode.LineTo(147.26f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 60.09f),
                    PathNode.LineTo(116.0f, 96.83f),
                    PathNode.LineTo(83.43f, 114.37f),
                    PathNode.LineTo(49.31f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 116.09f),
                    PathNode.LineTo(58.12f, 128.0f),
                    PathNode.LineTo(36.0f, 139.91f),
                    PathNode.Close,
                    PathNode.MoveTo(83.43f, 141.63f),
                    PathNode.LineTo(116.0f, 159.17f),
                    PathNode.LineTo(116.0f, 195.91f),
                    PathNode.LineTo(49.31f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 195.91f),
                    PathNode.LineTo(140.0f, 159.17f),
                    PathNode.LineTo(172.57f, 141.63f),
                    PathNode.LineTo(206.69f, 160.0f),
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
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
