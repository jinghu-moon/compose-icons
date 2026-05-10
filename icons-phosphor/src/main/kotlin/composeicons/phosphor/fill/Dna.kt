package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorFillIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 204.5v27.5c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-27.5c.08-24.266-13.641-46.468-35.38-57.25L100.22 123.06C73.047 109.583 55.898 81.831 56 51.5v-27.5c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v27.5c-.08 24.266 13.641 46.468 35.38 57.25l48.4 24.19c27.173 13.477 44.322 41.229 44.22 71.56ZM163.18 192h-79.27c-2.217 .005-4.336-.91-5.853-2.527-1.517-1.617-2.294-3.791-2.147-6.003 .372-4.273 3.981-7.533 8.27-7.47h65.52c1.636-.002 3.105-1 3.711-2.519 .606-1.519 .225-3.254-.961-4.381-3.301-3.007-7.003-5.541-11-7.53L94.8 138.23c-1.312-.656-2.878-.541-4.08 .3C68.916 153.396 55.908 178.111 56 204.5v27.23c-.068 4.291 3.195 7.903 7.47 8.27 2.212 .147 4.386-.631 6.003-2.147C71.09 236.336 72.005 234.217 72 232v-16h92c2.209 0 4-1.791 4-4v-7.5c-0-3.128-.302-6.249-.9-9.32-.388-1.855-2.025-3.182-3.92-3.18ZM191.47 16c-4.275 .367-7.538 3.979-7.47 8.27v15.73h-92c-2.209 0-4 1.791-4 4v7.5c0 3.128 .302 6.249 .9 9.32 .388 1.855 2.025 3.182 3.92 3.18h79c4.281-.053 7.879 3.205 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.516 1.617-3.636 2.532-5.853 2.527h-65.77c-1.636 .002-3.105 1-3.711 2.519-.606 1.519-.225 3.254 .961 4.381 3.301 3.007 7.003 5.541 11 7.53l46.67 23.34c1.312 .656 2.878 .541 4.08-.3C187.096 102.6 200.096 77.885 200 51.5v-27.5c.005-2.217-.91-4.336-2.527-5.853C195.856 16.631 193.682 15.853 191.47 16Z"),
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
        return _dna!!
    }

private var _dna: ImageVector? = null
