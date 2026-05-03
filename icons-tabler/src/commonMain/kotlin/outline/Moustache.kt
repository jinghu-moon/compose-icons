package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moustache: ImageVector
    get() {
        if (_moustache != null) return _moustache!!
        _moustache = tablerOutlineIcon(
            name = "Moustache",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.CurveTo(16.072126f, 8.99967f, 17.062937f, 9.571511f, 17.599f, 10.5f),
                    PathNode.CurveTo(18.532f, 11.833f, 19.732f, 12.056f, 20.725f, 12.056f),
                    PathNode.LineTo(21.016f, 12.056f),
                    PathNode.LineTo(21.786f, 12.012f),
                    PathNode.LineTo(21.999f, 12.012f),
                    PathNode.CurveTo(21.036f, 13.938f, 18.836f, 14.937f, 15.399f, 15.012f),
                    PathNode.LineTo(14.999f, 15.012f),
                    PathNode.LineTo(14.834f, 15.012f),
                    PathNode.CurveTo(13.177146f, 14.966436f, 11.870936f, 13.586354f, 11.9165f, 11.9295f),
                    PathNode.CurveTo(11.962064f, 10.272646f, 13.342146f, 8.966436f, 14.999f, 9.012f),
                    PathNode.LineTo(15.0f, 9.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.CurveTo(7.927873f, 8.99967f, 6.937063f, 9.571511f, 6.401f, 10.5f),
                    PathNode.CurveTo(5.468f, 11.833f, 4.268f, 12.056f, 3.275f, 12.056f),
                    PathNode.LineTo(2.984f, 12.056f),
                    PathNode.LineTo(2.214f, 12.012f),
                    PathNode.LineTo(2.001f, 12.012f),
                    PathNode.CurveTo(2.964f, 13.938f, 5.164f, 14.937f, 8.601f, 15.012f),
                    PathNode.LineTo(9.001f, 15.012f),
                    PathNode.LineTo(9.166f, 15.012f),
                    PathNode.CurveTo(10.822854f, 14.966436f, 12.129064f, 13.586354f, 12.0835f, 11.9295f),
                    PathNode.CurveTo(12.037936f, 10.272646f, 10.657854f, 8.966436f, 9.001f, 9.012f),
                    PathNode.LineTo(9.0f, 9.0f)
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
        return _moustache!!
    }

private var _moustache: ImageVector? = null
