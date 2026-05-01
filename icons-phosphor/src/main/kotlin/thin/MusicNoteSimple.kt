package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) return _musicNoteSimple!!
        _musicNoteSimple = phosphorThinIcon(
            name = "MusicNoteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.15f, 60.17f),
                    PathNode.LineTo(129.15f, 36.17f),
                    PathNode.CurveTo(127.93904f, 35.806503f, 126.62752f, 36.036926f, 125.61298f, 36.791428f),
                    PathNode.CurveTo(124.59845f, 37.545925f, 124.00036f, 38.73566f, 124.0f, 40.0f),
                    PathNode.LineTo(124.0f, 158.75f),
                    PathNode.CurveTo(111.51558f, 140.98439f, 87.937935f, 134.98224f, 68.47849f, 144.61592f),
                    PathNode.CurveTo(49.019047f, 154.24959f, 39.49672f, 176.63834f, 46.054962f, 197.33777f),
                    PathNode.CurveTo(52.6132f, 218.03723f, 73.29091f, 230.85765f, 94.747604f, 227.5278f),
                    PathNode.CurveTo(116.20429f, 224.19794f, 132.02382f, 205.71352f, 132.0f, 184.0f),
                    PathNode.LineTo(132.0f, 45.38f),
                    PathNode.LineTo(206.85f, 67.83f),
                    PathNode.CurveTo(208.94514f, 68.40649f, 211.11731f, 67.20486f, 211.74222f, 65.12364f),
                    PathNode.CurveTo(212.36711f, 63.042427f, 211.21617f, 60.84299f, 209.15f, 60.17f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 220.0f),
                    PathNode.CurveTo(68.11775f, 220.0f, 52.0f, 203.88223f, 52.0f, 184.0f),
                    PathNode.CurveTo(52.0f, 164.11777f, 68.11775f, 148.0f, 88.0f, 148.0f),
                    PathNode.CurveTo(107.88225f, 148.0f, 124.0f, 164.11777f, 124.0f, 184.0f),
                    PathNode.CurveTo(124.0f, 203.88223f, 107.88225f, 220.0f, 88.0f, 220.0f),
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
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
