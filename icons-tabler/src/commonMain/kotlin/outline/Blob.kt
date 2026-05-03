package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blob: ImageVector
    get() {
        if (_blob != null) return _blob!!
        _blob = tablerOutlineIcon(
            name = "Blob",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.897f, 20.188f),
                    PathNode.CurveTo(7.567f, 20.94f, 9.793f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(14.207f, 21.0f, 16.434f, 20.941f, 18.104f, 20.188f),
                    PathNode.CurveTo(18.972f, 19.796f, 19.718f, 19.206f, 20.237f, 18.332f),
                    PathNode.CurveTo(20.751f, 17.467f, 21.0f, 16.392f, 21.0f, 15.098f),
                    PathNode.CurveTo(21.0f, 12.521f, 20.017f, 9.783f, 18.443f, 7.682f),
                    PathNode.CurveTo(16.873f, 5.588f, 14.61f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(9.39f, 4.0f, 7.127f, 5.588f, 5.557f, 7.682f),
                    PathNode.CurveTo(3.983f, 9.783f, 3.0f, 12.522f, 3.0f, 15.098f),
                    PathNode.CurveTo(3.0f, 16.393f, 3.249f, 17.467f, 3.763f, 18.332f),
                    PathNode.CurveTo(4.282f, 19.206f, 5.028f, 19.796f, 5.897f, 20.188f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _blob!!
    }

private var _blob: ImageVector? = null
