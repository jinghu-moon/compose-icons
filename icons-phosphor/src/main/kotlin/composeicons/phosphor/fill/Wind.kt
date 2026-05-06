package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wind: ImageVector
    get() {
        if (_wind != null) return _wind!!
        _wind = phosphorFillIcon(
            name = "Wind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 104h-96c-2.217 .005-4.336-.91-5.853-2.527C16.631 99.856 15.853 97.682 16 95.47c.367-4.275 3.979-7.538 8.27-7.47h87.73c2.217 .005 4.336-.91 5.853-2.527 1.517-1.617 2.294-3.791 2.147-6.003-.367-4.275-3.979-7.538-8.27-7.47h-19.44c-1.169 .012-2.286-.488-3.055-1.369-.769-.881-1.115-2.054-.945-3.211C90.734 50.523 106.011 38.52 123.007 40.145c16.995 1.625 29.721 16.306 28.918 33.36C151.122 90.559 137.073 103.979 120 104ZM239.92 101.71C238.754 85.406 225.488 72.602 209.153 72.014c-16.335-.588-30.487 11.229-32.823 27.406-.17 1.157 .176 2.331 .945 3.211 .769 .881 1.886 1.381 3.055 1.369h19.44c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.516 1.617-3.636 2.532-5.853 2.527h-167.75c-4.291-.068-7.903 3.195-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h176c8.885 .001 17.37-3.693 23.424-10.197 6.054-6.503 9.131-15.231 8.496-24.093ZM152 152h-111.73c-4.291-.068-7.903 3.195-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h103.73c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527h-19.69c-1.169-.012-2.286 .488-3.055 1.369-.769 .881-1.115 2.054-.945 3.211 2.444 16.897 17.721 28.9 34.717 27.275 16.995-1.625 29.721-16.306 28.918-33.36C183.122 165.441 169.073 152.021 152 152Z"),
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
        return _wind!!
    }

private var _wind: ImageVector? = null
