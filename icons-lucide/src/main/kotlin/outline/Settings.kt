package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Settings: ImageVector
    get() {
        if (_settings != null) return _settings!!
        _settings = lucideOutlineIcon(
            name = "Settings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.671 4.136 C 9.785 2.935 10.794 2.017 12.000 2.017 C 13.207 2.017 14.216 2.935 14.330 4.136 C 14.397 4.896 14.831 5.575 15.491 5.957 C 16.152 6.338 16.957 6.373 17.649 6.051 C 18.745 5.553 20.040 5.969 20.643 7.011 C 21.245 8.054 20.958 9.383 19.979 10.084 C 19.355 10.522 18.983 11.237 18.983 12.000 C 18.983 12.762 19.355 13.477 19.979 13.915 C 20.958 14.616 21.245 15.945 20.643 16.988 C 20.040 18.030 18.745 18.446 17.649 17.948 C 16.957 17.626 16.152 17.661 15.491 18.042 C 14.831 18.424 14.397 19.103 14.330 19.863 C 14.216 21.064 13.207 21.982 12.000 21.982 C 10.794 21.982 9.785 21.064 9.671 19.863 C 9.604 19.103 9.170 18.423 8.509 18.042 C 7.848 17.660 7.043 17.625 6.351 17.948 C 5.255 18.446 3.960 18.030 3.357 16.988 C 2.755 15.945 3.042 14.616 4.021 13.915 C 4.645 13.477 5.017 12.762 5.017 12.000 C 5.017 11.237 4.645 10.522 4.021 10.084 C 3.044 9.383 2.757 8.054 3.359 7.013 C 3.961 5.971 5.254 5.555 6.350 6.051 C 7.042 6.373 7.847 6.338 8.508 5.957 C 9.168 5.575 9.602 4.896 9.669 4.136"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 C 9.000 10.343 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 10.343 15.000 12.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _settings!!
    }

private var _settings: ImageVector? = null
