package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = phosphorLightIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 83.76f),
                    PathNode.LineTo(156.24f, 27.76f),
                    PathNode.CurveTo(155.11586f, 26.63446f, 153.59076f, 26.0014f, 152.0f, 26.0f),
                    PathNode.LineTo(56.0f, 26.0f),
                    PathNode.CurveTo(48.268013f, 26.0f, 42.0f, 32.268013f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 223.73198f, 48.268013f, 230.0f, 56.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(213.9986f, 86.40924f, 213.36554f, 84.88415f, 212.24f, 83.76f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 46.48f),
                    PathNode.LineTo(193.52f, 82.0f),
                    PathNode.LineTo(158.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(54.89543f, 218.0f, 54.0f, 217.10457f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 40.0f),
                    PathNode.CurveTo(54.0f, 38.89543f, 54.89543f, 38.0f, 56.0f, 38.0f),
                    PathNode.LineTo(146.0f, 38.0f),
                    PathNode.LineTo(146.0f, 88.0f),
                    PathNode.CurveTo(146.0f, 91.313705f, 148.6863f, 94.0f, 152.0f, 94.0f),
                    PathNode.LineTo(202.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.24f, 123.76f),
                    PathNode.CurveTo(158.57962f, 126.10254f, 158.57962f, 129.89746f, 156.24f, 132.24f),
                    PathNode.LineTo(136.49f, 152.0f),
                    PathNode.LineTo(156.24f, 171.76f),
                    PathNode.CurveTo(157.84523f, 173.25575f, 158.506f, 175.50844f, 157.96309f, 177.63431f),
                    PathNode.CurveTo(157.42018f, 179.76018f, 155.76018f, 181.42018f, 153.63431f, 181.96309f),
                    PathNode.CurveTo(151.50844f, 182.506f, 149.25575f, 181.84523f, 147.76f, 180.24f),
                    PathNode.LineTo(128.0f, 160.49f),
                    PathNode.LineTo(108.24f, 180.24f),
                    PathNode.CurveTo(105.87592f, 182.44287f, 102.191925f, 182.37787f, 99.90703f, 180.09297f),
                    PathNode.CurveTo(97.62213f, 177.80807f, 97.55713f, 174.12408f, 99.76f, 171.76f),
                    PathNode.LineTo(119.51f, 152.0f),
                    PathNode.LineTo(99.76f, 132.24f),
                    PathNode.CurveTo(98.15478f, 130.74423f, 97.494f, 128.49156f, 98.03692f, 126.3657f),
                    PathNode.CurveTo(98.57983f, 124.23982f, 100.23982f, 122.57983f, 102.3657f, 122.03692f),
                    PathNode.CurveTo(104.491554f, 121.494f, 106.74423f, 122.15478f, 108.24f, 123.76f),
                    PathNode.LineTo(128.0f, 143.51f),
                    PathNode.LineTo(147.76f, 123.76f),
                    PathNode.CurveTo(150.10254f, 121.42038f, 153.89746f, 121.42038f, 156.24f, 123.76f),
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
        return _fileX!!
    }

private var _fileX: ImageVector? = null
