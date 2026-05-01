package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorLightIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.24f, 147.76f),
                    PathNode.CurveTo(182.57962f, 150.10254f, 182.57962f, 153.89746f, 180.24f, 156.24f),
                    PathNode.LineTo(156.24f, 180.24f),
                    PathNode.CurveTo(153.87592f, 182.44287f, 150.19193f, 182.37787f, 147.90703f, 180.09297f),
                    PathNode.CurveTo(145.62213f, 177.80807f, 145.55713f, 174.12408f, 147.76f, 171.76f),
                    PathNode.LineTo(167.51f, 152.0f),
                    PathNode.LineTo(147.76f, 132.24f),
                    PathNode.CurveTo(146.15477f, 130.74423f, 145.494f, 128.49156f, 146.03691f, 126.3657f),
                    PathNode.CurveTo(146.57982f, 124.23982f, 148.23982f, 122.57983f, 150.36569f, 122.03692f),
                    PathNode.CurveTo(152.49156f, 121.494f, 154.74425f, 122.15478f, 156.24f, 123.76f),
                    PathNode.Close,
                    PathNode.MoveTo(108.24f, 123.76f),
                    PathNode.CurveTo(105.89746f, 121.42038f, 102.10254f, 121.42038f, 99.76f, 123.76f),
                    PathNode.LineTo(75.76f, 147.76f),
                    PathNode.CurveTo(73.42038f, 150.10254f, 73.42038f, 153.89746f, 75.76f, 156.24f),
                    PathNode.LineTo(99.76f, 180.24f),
                    PathNode.CurveTo(101.25577f, 181.84523f, 103.508446f, 182.506f, 105.6343f, 181.96309f),
                    PathNode.CurveTo(107.76018f, 181.42018f, 109.42017f, 179.76018f, 109.96308f, 177.63431f),
                    PathNode.CurveTo(110.506f, 175.50844f, 109.84522f, 173.25575f, 108.24f, 171.76f),
                    PathNode.LineTo(88.49f, 152.0f),
                    PathNode.LineTo(108.24f, 132.24f),
                    PathNode.CurveTo(110.57962f, 129.89746f, 110.57962f, 126.10254f, 108.24f, 123.76f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 88.0f),
                    PathNode.LineTo(214.0f, 216.0f),
                    PathNode.CurveTo(214.0f, 223.73198f, 207.73198f, 230.0f, 200.0f, 230.0f),
                    PathNode.LineTo(56.0f, 230.0f),
                    PathNode.CurveTo(48.268013f, 230.0f, 42.0f, 223.73198f, 42.0f, 216.0f),
                    PathNode.LineTo(42.0f, 40.0f),
                    PathNode.CurveTo(42.0f, 32.268013f, 48.268013f, 26.0f, 56.0f, 26.0f),
                    PathNode.LineTo(152.0f, 26.0f),
                    PathNode.CurveTo(153.59422f, 25.998747f, 155.12341f, 26.632008f, 156.25f, 27.76f),
                    PathNode.LineTo(212.25f, 83.76f),
                    PathNode.CurveTo(213.37187f, 84.88577f, 214.00125f, 86.410675f, 214.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 82.0f),
                    PathNode.LineTo(193.52f, 82.0f),
                    PathNode.LineTo(158.0f, 46.48f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 216.0f),
                    PathNode.LineTo(202.0f, 94.0f),
                    PathNode.LineTo(152.0f, 94.0f),
                    PathNode.CurveTo(148.6863f, 94.0f, 146.0f, 91.313705f, 146.0f, 88.0f),
                    PathNode.LineTo(146.0f, 38.0f),
                    PathNode.LineTo(56.0f, 38.0f),
                    PathNode.CurveTo(54.89543f, 38.0f, 54.0f, 38.89543f, 54.0f, 40.0f),
                    PathNode.LineTo(54.0f, 216.0f),
                    PathNode.CurveTo(54.0f, 217.10457f, 54.89543f, 218.0f, 56.0f, 218.0f),
                    PathNode.LineTo(200.0f, 218.0f),
                    PathNode.CurveTo(201.10457f, 218.0f, 202.0f, 217.10457f, 202.0f, 216.0f),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
