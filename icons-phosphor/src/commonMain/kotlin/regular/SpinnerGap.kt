package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpinnerGap: ImageVector
    get() {
        if (_spinnerGap != null) return _spinnerGap!!
        _spinnerGap = phosphorRegularIcon(
            name = "SpinnerGap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 32.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 68.41828f, 132.41827f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(123.58172f, 72.0f, 120.0f, 68.41828f, 120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.CurveTo(120.0f, 27.581722f, 123.58172f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(132.41827f, 24.0f, 136.0f, 27.581722f, 136.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(187.58173f, 120.0f, 184.0f, 123.58172f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 132.41827f, 187.58173f, 136.0f, 192.0f, 136.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.CurveTo(228.41827f, 136.0f, 232.0f, 132.41827f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 123.58172f, 228.41827f, 120.0f, 224.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.91f, 167.6f),
                    PathNode.CurveTo(175.76468f, 164.61177f, 170.81075f, 164.6752f, 167.74297f, 167.74297f),
                    PathNode.CurveTo(164.6752f, 170.81075f, 164.61177f, 175.76468f, 167.6f, 178.91f),
                    PathNode.LineTo(190.22f, 201.54f),
                    PathNode.CurveTo(193.34593f, 204.66592f, 198.41406f, 204.66592f, 201.54f, 201.54f),
                    PathNode.CurveTo(204.66592f, 198.41406f, 204.66592f, 193.34593f, 201.54f, 190.22f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(123.58172f, 184.0f, 120.0f, 187.58173f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.CurveTo(120.0f, 228.41827f, 123.58172f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(132.41827f, 232.0f, 136.0f, 228.41827f, 136.0f, 224.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 187.58173f, 132.41827f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(77.09f, 167.6f),
                    PathNode.LineTo(54.46f, 190.22f),
                    PathNode.CurveTo(51.33407f, 193.34593f, 51.33407f, 198.41406f, 54.46f, 201.54f),
                    PathNode.CurveTo(57.58593f, 204.66592f, 62.654068f, 204.66592f, 65.78f, 201.54f),
                    PathNode.LineTo(88.4f, 178.91f),
                    PathNode.CurveTo(91.38823f, 175.76468f, 91.32481f, 170.81075f, 88.25703f, 167.74297f),
                    PathNode.CurveTo(85.18925f, 164.6752f, 80.23531f, 164.61177f, 77.09f, 167.6f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 123.58172f, 68.41828f, 120.0f, 64.0f, 120.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(27.581722f, 120.0f, 24.0f, 123.58172f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 132.41827f, 27.581722f, 136.0f, 32.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(68.41828f, 136.0f, 72.0f, 132.41827f, 72.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(65.78f, 54.46f),
                    PathNode.CurveTo(62.654068f, 51.33407f, 57.58593f, 51.33407f, 54.46f, 54.46f),
                    PathNode.CurveTo(51.33407f, 57.58593f, 51.33407f, 62.654068f, 54.46f, 65.78f),
                    PathNode.LineTo(77.09f, 88.4f),
                    PathNode.CurveTo(80.23531f, 91.38823f, 85.18925f, 91.32481f, 88.25703f, 88.25703f),
                    PathNode.CurveTo(91.32481f, 85.18925f, 91.38823f, 80.23531f, 88.4f, 77.09f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _spinnerGap!!
    }

private var _spinnerGap: ImageVector? = null
