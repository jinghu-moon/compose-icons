package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorThinIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.86 47.36c-.381-6.032-5.188-10.839-11.22-11.22-12-.71-42.82 .38-68.35 25.91L134.35 68h-60c-3.184-.008-6.238 1.26-8.48 3.52L31.52 105.85c-3.218 3.217-4.34 7.977-2.898 12.292 1.443 4.315 5.202 7.443 9.708 8.078l39.79 5.55 46.11 46.11 5.55 39.81c.641 4.502 3.771 8.255 8.086 9.693 4.314 1.438 9.071 .314 12.284-2.903l34.34-34.35c2.26-2.242 3.528-5.296 3.52-8.48v-60l5.94-5.94C219.48 90.18 220.57 59.41 219.86 47.36ZM36.21 115.6c-.484-1.442-.095-3.034 1-4.09L71.53 77.17c.748-.748 1.762-1.168 2.82-1.17h52L78.58 123.76 39.44 118.3c-1.508-.201-2.765-1.252-3.23-2.7ZM180 181.65c.001 1.061-.42 2.079-1.17 2.83l-34.35 34.34c-1.069 1.072-2.652 1.448-4.09 .972-1.437-.476-2.482-1.723-2.7-3.222l-5.46-39.15L180 129.65ZM128 170.34 85.66 128 145.94 67.71C169.18 44.47 197.19 43.48 208.16 44.13c2.002 .109 3.601 1.708 3.71 3.71 .65 11-.35 39-23.58 62.22ZM98.21 189.48C94 198.66 80 220 40 220c-2.209 0-4-1.791-4-4 0-40 21.34-54 30.52-58.21 2.01-.917 4.383-.03 5.3 1.98 .917 2.01 .03 4.383-1.98 5.3-7.46 3.41-24.43 14.66-25.76 46.85 32.19-1.33 43.44-18.3 46.85-25.76 .917-2.01 3.29-2.897 5.3-1.98 2.01 .917 2.897 3.29 1.98 5.3Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
