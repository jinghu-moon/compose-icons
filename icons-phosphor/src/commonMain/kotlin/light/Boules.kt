package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorLightIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.22f, 60.29f),
                    PathNode.LineTo(60.29f, 187.22f),
                    PathNode.CurveTo(55.363506f, 181.59952f, 51.154587f, 175.3886f, 47.76f, 168.73f),
                    PathNode.LineTo(168.76f, 47.73f),
                    PathNode.CurveTo(175.40971f, 51.136078f, 181.61052f, 55.35505f, 187.22f, 60.29f),
                    PathNode.Close,
                    PathNode.MoveTo(195.71f, 68.78f),
                    PathNode.CurveTo(200.63649f, 74.400475f, 204.84541f, 80.611404f, 208.24f, 87.27f),
                    PathNode.LineTo(87.24f, 208.27f),
                    PathNode.CurveTo(80.581406f, 204.87541f, 74.370476f, 200.66649f, 68.75f, 195.74f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 38.0f),
                    PathNode.CurveTo(137.78998f, 37.99117f, 147.51534f, 39.585594f, 156.79f, 42.72f),
                    PathNode.LineTo(42.72f, 156.79f),
                    PathNode.CurveTo(33.445522f, 129.32062f, 37.972195f, 99.0655f, 54.880325f, 75.51347f),
                    PathNode.CurveTo(71.78846f, 51.961445f, 99.007195f, 37.997086f, 128.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(118.210014f, 218.00883f, 108.484665f, 216.4144f, 99.21f, 213.28f),
                    PathNode.LineTo(213.28f, 99.21f),
                    PathNode.CurveTo(222.55447f, 126.67938f, 218.0278f, 156.93451f, 201.11967f, 180.48653f),
                    PathNode.CurveTo(184.21155f, 204.03856f, 156.9928f, 218.00291f, 128.0f, 218.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _boules!!
    }

private var _boules: ImageVector? = null
