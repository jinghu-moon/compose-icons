package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorFillIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.CurveTo(105.90861f, 144.0f, 88.0f, 126.09139f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 81.90861f, 105.90861f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(150.09138f, 64.0f, 168.0f, 81.90861f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 126.09139f, 150.09138f, 144.0f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 176.0f),
                    PathNode.LineTo(136.0f, 159.42f),
                    PathNode.CurveTo(165.07062f, 155.22401f, 185.95961f, 129.28053f, 183.85622f, 99.98408f),
                    PathNode.CurveTo(181.75284f, 70.68762f, 157.37187f, 47.994373f, 128.0f, 47.994373f),
                    PathNode.CurveTo(98.62813f, 47.994373f, 74.24717f, 70.68762f, 72.143776f, 99.98408f),
                    PathNode.CurveTo(70.04039f, 129.28053f, 90.92939f, 155.22401f, 120.0f, 159.42f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.CurveTo(91.58172f, 176.0f, 88.0f, 179.58173f, 88.0f, 184.0f),
                    PathNode.CurveTo(88.0f, 188.41827f, 91.58172f, 192.0f, 96.0f, 192.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.CurveTo(120.0f, 212.41827f, 123.58172f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(132.41827f, 216.0f, 136.0f, 212.41827f, 136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(164.41827f, 192.0f, 168.0f, 188.41827f, 168.0f, 184.0f),
                    PathNode.CurveTo(168.0f, 179.58173f, 164.41827f, 176.0f, 160.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
