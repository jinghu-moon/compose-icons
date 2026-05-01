package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MusicNote: ImageVector
    get() {
        if (_musicNote != null) return _musicNote!!
        _musicNote = phosphorDuotoneIcon(
            name = "MusicNote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(128.0f, 206.09138f, 110.09139f, 224.0f, 88.0f, 224.0f),
                    PathNode.CurveTo(65.90861f, 224.0f, 48.0f, 206.09138f, 48.0f, 184.0f),
                    PathNode.CurveTo(48.0f, 161.90862f, 65.90861f, 144.0f, 88.0f, 144.0f),
                    PathNode.CurveTo(110.09139f, 144.0f, 128.0f, 161.90862f, 128.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.3f, 56.34f),
                    PathNode.LineTo(130.3f, 32.34f),
                    PathNode.CurveTo(127.87808f, 31.613007f, 125.255035f, 32.073856f, 123.22597f, 33.58285f),
                    PathNode.CurveTo(121.1969f, 35.09185f, 120.00071f, 37.471325f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 148.26f),
                    PathNode.CurveTo(103.116066f, 133.15857f, 77.97277f, 131.91632f, 59.682487f, 145.27994f),
                    PathNode.CurveTo(41.392204f, 158.64355f, 34.93409f, 182.97504f, 44.18979f, 203.64996f),
                    PathNode.CurveTo(53.44549f, 224.32489f, 75.89533f, 235.71494f, 98.045845f, 230.97409f),
                    PathNode.CurveTo(120.19636f, 226.23326f, 136.0175f, 206.65216f, 136.0f, 184.0f),
                    PathNode.LineTo(136.0f, 98.75f),
                    PathNode.LineTo(205.7f, 119.66f),
                    PathNode.CurveTo(208.12192f, 120.38699f, 210.74496f, 119.92615f, 212.77403f, 118.417145f),
                    PathNode.CurveTo(214.8031f, 116.90815f, 215.99928f, 114.52868f, 216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.CurveTo(215.99901f, 60.468433f, 213.68246f, 57.355324f, 210.3f, 56.34f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 216.0f),
                    PathNode.CurveTo(70.32689f, 216.0f, 56.0f, 201.67311f, 56.0f, 184.0f),
                    PathNode.CurveTo(56.0f, 166.32689f, 70.32689f, 152.0f, 88.0f, 152.0f),
                    PathNode.CurveTo(105.67311f, 152.0f, 120.0f, 166.32689f, 120.0f, 184.0f),
                    PathNode.CurveTo(120.0f, 201.67311f, 105.67311f, 216.0f, 88.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 101.25f),
                    PathNode.LineTo(136.0f, 82.05f),
                    PathNode.LineTo(136.0f, 50.75f),
                    PathNode.LineTo(200.0f, 70.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
