package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorLightIcon(
            name = "Trademark",
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
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 104.0f),
                    PathNode.CurveTo(110.0f, 107.313705f, 107.313705f, 110.0f, 104.0f, 110.0f),
                    PathNode.LineTo(94.0f, 110.0f),
                    PathNode.LineTo(94.0f, 152.0f),
                    PathNode.CurveTo(94.0f, 155.3137f, 91.313705f, 158.0f, 88.0f, 158.0f),
                    PathNode.CurveTo(84.686295f, 158.0f, 82.0f, 155.3137f, 82.0f, 152.0f),
                    PathNode.LineTo(82.0f, 110.0f),
                    PathNode.LineTo(72.0f, 110.0f),
                    PathNode.CurveTo(68.686295f, 110.0f, 66.0f, 107.313705f, 66.0f, 104.0f),
                    PathNode.CurveTo(66.0f, 100.686295f, 68.686295f, 98.0f, 72.0f, 98.0f),
                    PathNode.LineTo(104.0f, 98.0f),
                    PathNode.CurveTo(107.313705f, 98.0f, 110.0f, 100.686295f, 110.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 104.0f),
                    PathNode.LineTo(190.0f, 152.0f),
                    PathNode.CurveTo(190.0f, 155.3137f, 187.3137f, 158.0f, 184.0f, 158.0f),
                    PathNode.CurveTo(180.6863f, 158.0f, 178.0f, 155.3137f, 178.0f, 152.0f),
                    PathNode.LineTo(178.0f, 120.0f),
                    PathNode.LineTo(160.52f, 140.0f),
                    PathNode.CurveTo(159.381f, 141.2915f, 157.742f, 142.03137f, 156.02f, 142.03137f),
                    PathNode.CurveTo(154.29799f, 142.03137f, 152.659f, 141.2915f, 151.52f, 140.0f),
                    PathNode.LineTo(134.0f, 120.0f),
                    PathNode.LineTo(134.0f, 152.0f),
                    PathNode.CurveTo(134.0f, 155.3137f, 131.3137f, 158.0f, 128.0f, 158.0f),
                    PathNode.CurveTo(124.686295f, 158.0f, 122.0f, 155.3137f, 122.0f, 152.0f),
                    PathNode.LineTo(122.0f, 104.0f),
                    PathNode.CurveTo(121.97721f, 101.48915f, 123.52031f, 99.229675f, 125.867325f, 98.33727f),
                    PathNode.CurveTo(128.21434f, 97.44487f, 130.86882f, 98.108315f, 132.52f, 100.0f),
                    PathNode.LineTo(156.0f, 126.89f),
                    PathNode.LineTo(179.48f, 100.05f),
                    PathNode.CurveTo(181.1252f, 98.165405f, 183.76706f, 97.49936f, 186.10909f, 98.37874f),
                    PathNode.CurveTo(188.45111f, 99.25811f, 190.00174f, 101.49832f, 190.0f, 104.0f),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
