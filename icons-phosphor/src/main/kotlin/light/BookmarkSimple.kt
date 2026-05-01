package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) return _bookmarkSimple!!
        _bookmarkSimple = phosphorLightIcon(
            name = "BookmarkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 34.0f),
                    PathNode.LineTo(72.0f, 34.0f),
                    PathNode.CurveTo(64.26801f, 34.0f, 58.0f, 40.268013f, 58.0f, 48.0f),
                    PathNode.LineTo(58.0f, 224.0f),
                    PathNode.CurveTo(57.999268f, 226.18152f, 59.182644f, 228.19154f, 61.09051f, 229.24939f),
                    PathNode.CurveTo(62.99838f, 230.30724f, 65.33008f, 230.2462f, 67.18f, 229.09f),
                    PathNode.LineTo(127.99f, 191.09f),
                    PathNode.LineTo(188.82f, 229.09f),
                    PathNode.CurveTo(190.66992f, 230.2462f, 193.00162f, 230.30724f, 194.90948f, 229.24939f),
                    PathNode.CurveTo(196.81737f, 228.19154f, 198.00073f, 226.18152f, 198.0f, 224.0f),
                    PathNode.LineTo(198.0f, 48.0f),
                    PathNode.CurveTo(198.0f, 40.268013f, 191.73198f, 34.0f, 184.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.0f, 213.17f),
                    PathNode.LineTo(131.17f, 178.91f),
                    PathNode.CurveTo(129.22438f, 177.69398f, 126.75562f, 177.69398f, 124.81f, 178.91f),
                    PathNode.LineTo(70.0f, 213.17f),
                    PathNode.LineTo(70.0f, 48.0f),
                    PathNode.CurveTo(70.0f, 46.89543f, 70.89543f, 46.0f, 72.0f, 46.0f),
                    PathNode.LineTo(184.0f, 46.0f),
                    PathNode.CurveTo(185.10457f, 46.0f, 186.0f, 46.89543f, 186.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bookmarkSimple!!
    }

private var _bookmarkSimple: ImageVector? = null
